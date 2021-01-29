package com.fh.shop.service.impl;

import com.fh.shop.dao.PeopertyDao;
import com.fh.shop.dao.PeopertyValueDao;
import com.fh.shop.entity.po.Peoperty;
import com.fh.shop.entity.po.PeopertyValue;
import com.fh.shop.entity.vo.PageResult;
import com.fh.shop.entity.vo.PeopertyParams;
import com.fh.shop.service.PeopertyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service
public class PeopertyServiceImpl implements PeopertyService {
    @Resource
    private PeopertyDao peopertyDao;
    @Resource
    private PeopertyValueDao peopertyValueDao;
    @Override
    public void delete(Integer id) {
        peopertyDao.delete(id);
    }

    @Override
    public void addPeoperty(Peoperty peoperty) {
        peoperty.setCreateDate(new Date());
        peoperty.setIsDel(0);
        peopertyDao.addPeoperty(peoperty);
    }

    @Override
    public void updatePeoperty(Peoperty peoperty) {
        peoperty.setUpdateDate(new Date());
        peopertyDao.updatePeoperty(peoperty);
    }

    @Override
    public PageResult<Peoperty> queryPeopertyData(PeopertyParams params) {
        Long count=peopertyDao.queryCount(params);
        params.setStartIndex((params.getPage()-1)*params.getLimit());
       List<Peoperty>list= peopertyDao.queryPeopertyData(params);
        PageResult<Peoperty>peo=new PageResult<>(count,list);
        return peo;
    }

    @Override
    public Peoperty queryPeopertyById(Integer id) {

        return peopertyDao.queryPeopertyById(id);
    }

    @Override
    public List<Peoperty> queryPeopertyByTypeId(Integer typeId) {
        return peopertyDao.queryPeopertyByTypeId(typeId);
    }

    @Override
    public Map queryAllByTypeId(Integer typeId) {
        Map map=new HashMap();
        List<Peoperty> peo = peopertyDao.queryPeopertyByTypeId(typeId);
            List<Peoperty> skudatas=new ArrayList<>();
            List<Peoperty> notSkudatas=new ArrayList<>();
        for (int i = 0; i <peo.size() ; i++) {
            Peoperty peoperty = peo.get(i);
            if(peoperty.getIsSku() == 0) {
                if (peoperty.getPeopertyType() != 3) {
                    List<PeopertyValue> peopertyValues = peopertyValueDao.queryByPeoId(peoperty.getId());
                    peoperty.setValues(peopertyValues);
                }
                skudatas.add(peoperty);
            }
            else {
                if (peoperty.getPeopertyType() != 3) {
                    List<PeopertyValue> peopertyValues = peopertyValueDao.queryByPeoId(peoperty.getId());
                    peoperty.setValues(peopertyValues);
                }
                notSkudatas.add(peoperty);
            }

        }
        //查询sku数据
        map.put("skudatas",skudatas);
        //非sku数据
        map.put("notSkudatas",notSkudatas);
        return map;
    }
}

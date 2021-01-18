package com.fh.shop.service.impl;

import com.fh.shop.dao.PeopertyDao;
import com.fh.shop.entity.po.Peoperty;
import com.fh.shop.entity.vo.PageResult;
import com.fh.shop.entity.vo.PeopertyParams;
import com.fh.shop.service.PeopertyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class PeopertyServiceImpl implements PeopertyService {
    @Resource
    private PeopertyDao peopertyDao;
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
}

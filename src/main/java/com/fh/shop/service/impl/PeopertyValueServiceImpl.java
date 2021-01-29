package com.fh.shop.service.impl;

import com.fh.shop.dao.PeopertyValueDao;
import com.fh.shop.entity.po.PeopertyValue;
import com.fh.shop.service.PeopertyValueService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PeopertyValueServiceImpl implements PeopertyValueService {
    @Resource
    private PeopertyValueDao peopertyValueDao;

    @Override
    public void deletePeopertyValue(Integer id) {
        peopertyValueDao.deletePeopertyValue(id);
    }

    @Override
    public PeopertyValue quertyPeopertyValueById(Integer id) {
        return peopertyValueDao.quertyPeopertyValueById(id);
    }

    @Override
    public void updatePeopertyValue(PeopertyValue peopertyValue) {
        peopertyValueDao.updatePeopertyValue(peopertyValue);
    }

    @Override
    public void addPeopertyValue(PeopertyValue peopertyValue) {
        peopertyValue.setIsDel(0);
        peopertyValueDao.addPeopertyValues(peopertyValue);
    }

    @Override
    public List<PeopertyValue> queryByPeoId(Integer peoId) {
        return peopertyValueDao.queryByPeoId(peoId);
    }

}
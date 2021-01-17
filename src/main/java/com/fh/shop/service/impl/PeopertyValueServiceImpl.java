package com.fh.shop.service.impl;

import com.fh.shop.dao.PeopertyValueDao;
import com.fh.shop.service.PeopertyValueService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PeopertyValueServiceImpl implements PeopertyValueService {
    @Resource
    private PeopertyValueDao peopertyValueDao;

    @Override
    public void deletePeopertyValue(Integer id) {
        peopertyValueDao.deletePeopertyValue(id);
    }
}
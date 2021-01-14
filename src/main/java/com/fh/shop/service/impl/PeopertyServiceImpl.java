package com.fh.shop.service.impl;

import com.fh.shop.dao.PeopertyDao;
import com.fh.shop.service.PeopertyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PeopertyServiceImpl implements PeopertyService {
    @Resource
    private PeopertyDao peopertyDao;
    @Override
    public void delete(Integer id) {
        peopertyDao.delete(id);
    }
}

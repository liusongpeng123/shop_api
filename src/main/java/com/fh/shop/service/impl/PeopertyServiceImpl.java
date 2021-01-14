package com.fh.shop.service.impl;

import com.fh.shop.dao.PeopertyDao;
import com.fh.shop.entity.po.Peoperty;
import com.fh.shop.service.PeopertyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

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
}

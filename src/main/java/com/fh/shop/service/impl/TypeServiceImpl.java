package com.fh.shop.service.impl;

import com.fh.shop.dao.TypeDao;
import com.fh.shop.entity.po.Type;
import com.fh.shop.service.TypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@Service
public class TypeServiceImpl implements TypeService {
    @Resource
    private TypeDao typeDao;
    @Override
    public List<Type> queryTypeData() {
        return typeDao.queryTypeData();
    }

    @Override
    public List<Type> queryDataByPid(Integer pid) {
        return typeDao.queryDataByPid(pid);
    }

    @Override
    public void update(Type type) {
        type.setUpdateDate(new Date());
        typeDao.update(type);
    }

    @Override
    public Integer add(Type type) {
        type.setCreateDate(new Date());
        type.setIsDel(0);
      Integer  id=  typeDao.add(type);
        return id;
    }

    @Override
    public void deleteTypeById(Integer id) {

        typeDao.deleteTypeById(id);
    }

    @Override
    public Type queryById(Integer id) {
        return typeDao.queryById(id);
    }
}

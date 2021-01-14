package com.fh.shop.service;

import com.fh.shop.entity.po.Type;


import java.util.List;

public interface TypeService {

    List<Type> queryTypeData();

    List<Type> queryDataByPid(Integer pid);

    void update(Type type);

    Integer add(Type type);

    void deleteTypeById(Integer id);
}

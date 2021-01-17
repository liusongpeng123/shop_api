package com.fh.shop.dao;

import org.apache.ibatis.annotations.Delete;

public interface PeopertyValueDao {

@Delete("delete from t_peopertyValue where id=#{id}")
    void deletePeopertyValue(Integer id);
}

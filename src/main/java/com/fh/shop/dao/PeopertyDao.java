package com.fh.shop.dao;

import org.apache.ibatis.annotations.Delete;

public interface PeopertyDao {
    @Delete("update  t_peoperty set isDel=1 where id=#{id}")
    void delete(Integer id);
}

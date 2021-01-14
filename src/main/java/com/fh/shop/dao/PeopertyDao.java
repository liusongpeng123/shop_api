package com.fh.shop.dao;

import com.fh.shop.entity.po.Peoperty;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;

public interface PeopertyDao {
    @Delete("update  t_peoperty set isDel=1 where id=#{id}")
    void delete(Integer id);
    @Insert("insert into t_peoperty (peopertyId,peopertyName,typeId,peopertyType,isSku,isDel,createDate) value (#{peopertyId},#{peopertyName},#{typeId},#{peopertyType},#{isSku},#{isDel},#{createDate})")
    void addPeoperty(Peoperty peoperty);
}
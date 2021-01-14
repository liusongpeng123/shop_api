package com.fh.shop.dao;

import com.fh.shop.entity.po.Peoperty;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

public interface PeopertyDao {
    @Delete("update  t_peoperty set isDel=1 where id=#{id}")
    void delete(Integer id);
    @Insert("insert into t_peoperty (peopertyId,peopertyName,typeId,peopertyType,isSku,isDel,createDate) value (#{peopertyId},#{peopertyName},#{typeId},#{peopertyType},#{isSku},#{isDel},#{createDate})")
    void addPeoperty(Peoperty peoperty);
    @Update("update t_peoperty set peopertyId=#{peopertyId},peopertyName=#{peopertyName},typeId=#{typeId},peopertyType=#{peopertyType},isSku=#{isSku},updateDate=#{updateDate} where id=#{id}")
    void updateById(Peoperty peoperty);
}

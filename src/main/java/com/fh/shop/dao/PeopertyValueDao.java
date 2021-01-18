package com.fh.shop.dao;

import com.fh.shop.entity.po.PeopertyValue;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


import java.util.List;

public interface PeopertyValueDao {

@Delete("update t_peopertyValue set isDel=1 where id=#{id}")
    void deletePeopertyValue(Integer id);
@Select("select * from t_peopertyValue where isDel=0 and id=#{id}")
    PeopertyValue quertyPeopertyValueById(Integer id);
@Update("update t_peopertyValue set name=#{name},nameCh=#{nameCh} where id=#{id} ")
    void updatePeopertyValue(PeopertyValue peopertyValue);
@Insert("insert into t_peopertyValue (name,nameCh,peoId,isDel) value (#{name},#{nameCh},#{peoId},#{isDel})")
    void addPeopertyValues(PeopertyValue peopertyValue);
@Select("select * from t_peopertyValue where isDel=0 and  peoId=#{peoId}")
    List<PeopertyValue> queryByPeoId(Integer peoId);
}

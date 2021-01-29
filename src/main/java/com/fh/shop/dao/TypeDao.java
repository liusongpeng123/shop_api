package com.fh.shop.dao;

import com.fh.shop.entity.po.Type;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface TypeDao {
@Select("select * from t_type where isDel=0")
    List<Type> queryTypeData();
@Select("select * from t_type where pid=#{pid}")
    List<Type> queryDataByPid(Integer pid);
@Update("<script>update t_type set updateDate=#{updateDate}" +
        " <if test='name != null and name != &quot;&quot;'>  , name  = #{name}</if>" +
        " <if test='pid != null and pid != &quot;&quot;'>  , pid  = #{pid}</if>" +
        " <if test='isDel != null and isDel != &quot;&quot;'>  , isDel  = #{isDel}</if>" +
        "where id=#{id} </script>")
    void update(Type type);
@Insert("insert into t_type (name,pid,createDate,isDel) value(#{name},#{pid},#{createDate},#{isDel}) ")
    Integer add(Type type);
@Delete("update t_type set isDel=1 where id=#{id}")
    void deleteTypeById(Integer id);
@Select("select * from t_type where id=#{id}")
    Type queryById(Integer id);
}

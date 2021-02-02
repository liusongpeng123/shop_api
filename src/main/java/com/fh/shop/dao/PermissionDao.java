package com.fh.shop.dao;

import com.fh.shop.entity.po.Permission;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface PermissionDao {
    @Select("select * from t_permission where id=#{id}")
    Permission queryPermissionById(Integer id);
    @Delete("update t_permission set isDel=1 where id=#{id}")
    void deleteById(Integer id);
    @Insert("insert into t_permission (pid,name,url,type,isDel,createDate,author) value(#{pid},#{name},#{url},#{type},#{isDel},#{createDate},#{author})")
    void addPermission(Permission permission);

    @Update("<script>update t_permission set updateDate=#{updateDate}" +
            " <if test='name != null and name != &quot;&quot;'>  , name  = #{name}</if>" +
            " <if test='pid != null'>  , pid  = #{pid}</if>" +
            " <if test='url != null and url != &quot;&quot;'>  , url  = #{url}</if>" +
            " <if test='type != null and type != &quot;&quot;'>  , type  = #{type}</if>" +
            "where id=#{id} </script>")
    void updatePermission(Permission permission);
    @Select("select * from t_permission")
    List<Permission> queryPermission();
}

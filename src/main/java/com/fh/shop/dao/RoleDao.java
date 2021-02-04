package com.fh.shop.dao;

import com.fh.shop.entity.po.Role;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface RoleDao {
    @Delete("update t_role set isDel=1 where id=#{id}")
    void deleteRole(Integer id);
    @Insert("insert into t_role (name,isDel,createDate,author) value (#{name},#{isDel},#{createDate},#{author})")
    void addRole(Role role);
    @Select("select * from t_role where isDel=0 and id=#{id}")
    Role queryRoleById(Integer id);
    @Update("update t_role set name=#{name} where id=#{id}")
    void updateRole(Role role);
    @Select("select * from t_role where isDel=0")
    List<Role> queryRole();
}

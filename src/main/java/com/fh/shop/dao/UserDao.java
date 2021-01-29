package com.fh.shop.dao;

import com.fh.shop.entity.po.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UserDao {
    @Select("select * from t_user where name=#{name}")
    User queryUserByName(String name);
    @Insert("insert into t_user (name,realName,password,sex,deptId,eduId,phone,email,birthday,idCard,createDate) value(#{name},#{realName},#{password},#{sex},#{deptId},#{eduId},#{phone},#{email},#{birthday},#{idCard},#{createDate})")
    void addUser(User user);
}

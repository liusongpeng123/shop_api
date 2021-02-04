package com.fh.shop.service;

import com.fh.shop.entity.po.Role;

import java.util.List;

public interface RoleService {
    void deleteRole(Integer id);

    void addRole(Role role);

    Role queryRoleById(Integer id);

    void updateRole(Role role);

    List<Role> queryRole();
}

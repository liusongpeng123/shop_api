package com.fh.shop.service;

import com.fh.shop.entity.po.Permission;

import java.util.List;

public interface PermissionService {
    Permission queryPermissionById(Integer id);

    void deleteById(Integer id);

    void addPermission(Permission permission);

    void updatePermission(Permission permission);

    List<Permission> queryPermission();
}

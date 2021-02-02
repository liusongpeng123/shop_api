package com.fh.shop.service.impl;

import com.fh.shop.dao.PermissionDao;
import com.fh.shop.entity.po.Permission;
import com.fh.shop.service.PermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {
    @Resource
    private PermissionDao permissionDao;
    @Override
    public Permission queryPermissionById(Integer id) {
        return permissionDao.queryPermissionById(id);
    }

    @Override
    public void deleteById(Integer id) {
        permissionDao.deleteById(id);
    }

    @Override
    public void addPermission(Permission permission) {
        permission.setIsDel(0);
        permission.setCreateDate(new Date());
        permission.setAuthor("test");
        permissionDao.addPermission(permission);
    }

    @Override
    public void updatePermission(Permission permission) {
        permission.setUpdateDate(new Date());
        permissionDao.updatePermission(permission);
    }

    @Override
    public List<Permission> queryPermission() {
        return permissionDao.queryPermission();
    }
}

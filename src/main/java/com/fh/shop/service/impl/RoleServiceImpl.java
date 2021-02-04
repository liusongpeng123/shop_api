package com.fh.shop.service.impl;

import com.fh.shop.dao.RoleDao;
import com.fh.shop.entity.po.Role;
import com.fh.shop.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Resource
    private RoleDao roleDao;
    @Override
    public void deleteRole(Integer id) {
        roleDao.deleteRole(id);
    }

    @Override
    public void addRole(Role role) {
        role.setCreateDate(new Date());
        role.setAuthor("test");
        role.setIsDel(0);
        roleDao.addRole(role);
    }

    @Override
    public Role queryRoleById(Integer id) {
        return roleDao.queryRoleById(id);
    }

    @Override
    public void updateRole(Role role) {
        roleDao.updateRole(role);
    }

    @Override
    public List<Role> queryRole() {
        return roleDao.queryRole();
    }
}

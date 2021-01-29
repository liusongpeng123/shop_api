package com.fh.shop.service.impl;

import com.fh.shop.dao.UserDao;
import com.fh.shop.entity.po.User;
import com.fh.shop.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User queryUserByName(String name) {
        return userDao.queryUserByName(name);
    }

    @Override
    public void addUser(User user) {

        userDao.addUser(user);
    }
}

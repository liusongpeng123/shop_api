package com.fh.shop.service;

import com.fh.shop.entity.po.User;

public interface UserService {
    User queryUserByName(String name);

    void addUser(User user);
}

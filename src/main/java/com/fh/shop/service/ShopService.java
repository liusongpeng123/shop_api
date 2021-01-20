package com.fh.shop.service;

import com.fh.shop.entity.po.Shop;

public interface ShopService {
    void addShop(Shop shop);

    void deleteShop(Integer id);

    void updateShop(Shop shop);
}

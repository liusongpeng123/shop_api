package com.fh.shop.service;

import com.fh.shop.entity.po.ShopProduct;

public interface ShopProductService {
    void addShopProduct(ShopProduct shopProduct);

    void updateShopProduct(ShopProduct shopProduct);

    ShopProduct queryShopProductById(Integer id);

    void deleteShopProduct(Integer id);
}

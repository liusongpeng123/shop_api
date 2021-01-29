package com.fh.shop.service;

import com.fh.shop.entity.po.ShopProduct;

import java.util.List;

public interface ShopProductService {
   /* void addShopProduct(ShopProduct shopProduct);*/

    void updateShopProduct(ShopProduct shopProduct);

    ShopProduct queryShopProductById(Integer id);

    void deleteShopProduct(Integer id);

    List<ShopProduct> queryShopProductByProId(Integer proId);

}

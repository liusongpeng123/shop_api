package com.fh.shop.service;

import com.fh.shop.entity.po.Shop;
import com.fh.shop.entity.vo.PageResult;
import com.fh.shop.entity.vo.ShopParams;

public interface ShopService {


    void deleteShop(Integer id);

    void updateShop(Shop shop);

    void addShop(Shop shop,String attr,String sku);

    PageResult<Shop> quertyShopData(ShopParams params);
}

package com.fh.shop.service.impl;

import com.fh.shop.dao.ShopProductDao;
import com.fh.shop.entity.po.ShopProduct;
import com.fh.shop.service.ShopProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ShopProductServiceImpl implements ShopProductService {
    @Resource
    private ShopProductDao shopProductDao;
    @Override
    public void addShopProduct(ShopProduct shopProduct) {
        shopProductDao.addShopProduct(shopProduct);
    }

    @Override
    public void updateShopProduct(ShopProduct shopProduct) {
        shopProductDao.updateShopProduct(shopProduct);
    }

    @Override
    public ShopProduct queryShopProductById(Integer id) {
        return shopProductDao.queryShopProductById(id);
    }

    @Override
    public void deleteShopProduct(Integer id) {
        shopProductDao.deleteShopProduct(id);
    }
}

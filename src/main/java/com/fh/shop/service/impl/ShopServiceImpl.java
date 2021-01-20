package com.fh.shop.service.impl;

import com.fh.shop.dao.ShopDao;
import com.fh.shop.entity.po.Shop;
import com.fh.shop.service.ShopService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class ShopServiceImpl implements ShopService {
    @Resource
    private ShopDao shopDao;

    @Override
    public void addShop(Shop shop) {
        shop.setCreateDate(new Date());
        shop.setIsDel(0);
        shop.setAuthor("test");
        shopDao.addShop(shop);
    }

    @Override
    public void deleteShop(Integer id) {
        shopDao.deleteShop(id);
    }

    @Override
    public void updateShop(Shop shop) {
        shop.setUpdateDate(new Date());
        shopDao.updateShop(shop);
    }
}

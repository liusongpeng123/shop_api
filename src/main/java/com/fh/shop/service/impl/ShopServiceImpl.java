package com.fh.shop.service.impl;

import com.fh.shop.dao.ShopDao;
import com.fh.shop.entity.po.Shop;
import com.fh.shop.entity.vo.PageParam;
import com.fh.shop.entity.vo.PageResult;
import com.fh.shop.entity.vo.ShopParams;
import com.fh.shop.service.ShopService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {
    @Resource
    private ShopDao shopDao;



    @Override
    public void deleteShop(Integer id) {
        shopDao.deleteShop(id);
    }

    @Override
    public void updateShop(Shop shop) {
        shop.setUpdateDate(new Date());
        shopDao.updateShop(shop);
    }

    @Override
    public Integer addShop(Shop shop) {
        shop.setCreateDate(new Date());
        shop.setIsDel(0);
        shop.setAuthor("test");
     Integer id=   shopDao.addShop(shop);
        return id;
    }

    @Override
    public PageResult<Shop> quertyShopData(ShopParams params) {
        Long count=shopDao.queryShopCount(params);
        params.setStartIndex((params.getPage()-1)*params.getLimit());
        List<Shop>list= shopDao.quertyShopData(params);
        PageResult<Shop>shop=new PageResult<>(count,list);
        return shop;
    }
}

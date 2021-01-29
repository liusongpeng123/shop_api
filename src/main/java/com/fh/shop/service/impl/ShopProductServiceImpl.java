package com.fh.shop.service.impl;

import com.fh.shop.dao.PeopertyDao;
import com.fh.shop.dao.ShopProductDao;
import com.fh.shop.entity.po.Peoperty;
import com.fh.shop.entity.po.ShopProduct;
import com.fh.shop.service.PeopertyService;
import com.fh.shop.service.ShopProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ShopProductServiceImpl implements ShopProductService {
    @Resource
    private ShopProductDao shopProductDao;
    @Resource
    private PeopertyDao  peopertyDao;

  /*  @Override
    public void addShopProduct(ShopProduct shopProduct) {
        shopProductDao.addShopProduct(shopProduct);
    }*/

    @Override
    public void updateShopProduct(ShopProduct shopProduct) {
        shopProductDao.updateShopProduct(shopProduct);
    }

    @Override
    //http://localhost:8080/api/shopProduct/queryShopProductById?proId=17
    public ShopProduct queryShopProductById(Integer id) {
        return shopProductDao.queryShopProductById(id);
    }

    @Override
    public void deleteShopProduct(Integer id) {
        shopProductDao.deleteShopProduct(id);
    }

    @Override
    public List<ShopProduct> queryShopProductByProId(Integer proId) {
        return shopProductDao.queryShopProductByProId(proId);
    }
}

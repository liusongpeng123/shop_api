package com.fh.shop.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fh.shop.dao.ShopDao;
import com.fh.shop.dao.ShopProductDao;
import com.fh.shop.entity.po.Shop;

import com.fh.shop.entity.po.ShopProduct;
import com.fh.shop.entity.vo.PageResult;
import com.fh.shop.entity.vo.ShopParams;
import com.fh.shop.service.ShopService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {
    @Resource
    private ShopDao shopDao;

    @Resource
    private ShopProductDao shopProductDao;
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
    @Transactional  //加上事务
    public void  addShop(Shop shop,String attr,String sku) {
        shop.setCreateDate(new Date());
        shop.setIsDel(0);
        shop.setAuthor("test");
                shopDao.addShop(shop);
        // 声明属性数据的对象
        List<ShopProduct> list=new ArrayList<>();
        //批量新增

        //将非sku  attr的json数组字符串 转为json数组对象
        JSONArray objects = JSONObject.parseArray(attr);
        for (int i = 0; i <objects.size() ; i++) {
            ShopProduct sp=new ShopProduct();
            sp.setProId(shop.getId());
            sp.setAttrData(objects.get(i).toString());
            list.add(sp);
        }
        //将sku  attr的json数组字符串 转为json数组对象
        JSONArray objects2 = JSONObject.parseArray(sku);
        for (int i = 0; i <objects2.size(); i++) {
            JSONObject jb= (JSONObject) objects2.get(i);
            ShopProduct sp=new ShopProduct();
            sp.setProId(shop.getId());
            sp.setStockss(jb.getInteger("kuCun"));
            sp.setPrices(jb.getDouble("jiaGe"));
            jb.remove("kuCun");
            jb.remove("jiaGe");
            sp.setAttrData(objects2.get(i).toString());
            list.add(sp);
        }
        shopProductDao.addDouble(list);

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

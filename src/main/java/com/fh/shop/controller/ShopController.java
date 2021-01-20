package com.fh.shop.controller;

import com.fh.shop.entity.po.Shop;
import com.fh.shop.entity.vo.PageResult;
import com.fh.shop.entity.vo.ResultData;
import com.fh.shop.entity.vo.ShopParams;
import com.fh.shop.service.ShopService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("api/shop/")
public class ShopController {
    @Resource
    private ShopService shopService;
    @PostMapping("addShop")
    //路径：http://localhost:8080/api/shop/addShop
    //参数:
    //返回值
    //请求方式：post
    public ResultData  addShop(Shop shop){
     Integer id=   shopService.addShop(shop);
        return ResultData.success("id");
    }
    //路径：http://localhost:8080/api/shop/deleteShop
    //参数:?limit=2&page=1
    //返回值
    //请求方式：delete
    @DeleteMapping("deleteShop")
    public ResultData deleteShop(Integer id){
        shopService.deleteShop(id);
        return ResultData.success("");
    }
    //路径：http://localhost:8080/api/shop/updateShop
    //参数:?limit=2&page=1
    //返回值
    //请求方式：post
    @PostMapping("updateShop")
    public ResultData updateShop(Shop shop){
        shopService.updateShop(shop);
        return ResultData.success("");
    }
    //路径：http://localhost:8080/api/shop/quertyShopData
    //参数:?limit=2&page=1
    //返回值"code": 0,  "msg": "",  "count": 3,"data": [{
    //            "id": 1,"peopertyId": 1,"peopertyName": "1",},{ } }]
    //请求方式：get
    @GetMapping("quertyShopData")
    public PageResult<Shop> quertyShopData(ShopParams params){
      PageResult<Shop>shop=  shopService.quertyShopData(params);
      return shop;
    }
}

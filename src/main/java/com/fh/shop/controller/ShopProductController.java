package com.fh.shop.controller;

import com.fh.shop.entity.po.ShopProduct;
import com.fh.shop.entity.vo.ResultData;
import com.fh.shop.service.ShopProductService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("api/shopProduct")
public class ShopProductController {
    @Resource
    private ShopProductService shopProductService;
    //路径：http://localhost:8080/api/shopProduct/addShopProduct
    //参数:
    //返回值
    //请求方式：post
/*    @PostMapping("addShopProduct")
    public ResultData addShopProduct(ShopProduct shopProduct){
        shopProductService.addShopProduct(shopProduct);
        return ResultData.success("");
    }*/
    //路径：http://localhost:8080/api/shopProduct/updateShopProduct
    //参数:
    //返回值
    //请求方式：post
    @PostMapping("updateShopProduct")
    public  ResultData updateShopProduct(ShopProduct shopProduct){
        shopProductService.updateShopProduct(shopProduct);
        return ResultData.success("");
    }
    //路径：http://localhost:8080/api/shopProduct/queryShopProductById
    //参数:id
    //返回值
    //请求方式：get
    @GetMapping("queryShopProductById")
    public ShopProduct queryShopProductById(Integer id){
        ShopProduct shopProduct=shopProductService.queryShopProductById(id);
        return shopProduct;
    }
    //路径：http://localhost:8080/api/shopProduct/deleteShopProduct
    //参数:id
    //返回值
    //请求方式：post
    @DeleteMapping("deleteShopProduct")
    public ResultData deleteShopProduct(Integer id){
        shopProductService.deleteShopProduct(id);
        return ResultData.success("");
    }
    //路径：http://localhost:8080/api/shopProduct/queryShopProductByProId
    //参数:id
    //返回值
    //请求方式：get
@GetMapping("queryShopProductByProId")
    public List<ShopProduct> queryShopProductByProId(Integer proId){
    List<ShopProduct>list= shopProductService.queryShopProductByProId(proId);
    return  list;
}
}

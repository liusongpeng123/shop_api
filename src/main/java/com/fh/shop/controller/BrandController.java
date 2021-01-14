package com.fh.shop.controller;

import com.fh.shop.entity.po.Brand;
import com.fh.shop.entity.vo.BrandParams;
import com.fh.shop.entity.vo.PageResult;
import com.fh.shop.entity.vo.ResultData;
import com.fh.shop.service.BrandService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("api/brand/")
public class BrandController {
    @Resource
    private BrandService brandService;
    //http://localhost:8080/api/brand/delete
    @PostMapping("delete")
    public ResultData delete(Integer id){
        brandService.delete(id);
        return  ResultData.success("");
    }
    //http://localhost:8080/api/brand/add?name=2
    @PostMapping("add")
    public ResultData add(Brand brand){
        brandService.add(brand);
        return  ResultData.success("");
    }
    //http://localhost:8080/api/brand/update
    @PostMapping("update")
    public ResultData updated(Brand brand){
        brandService.update(brand);
        return ResultData.success("");
    }
    @PostMapping("queryById")
    public ResultData queryById(Integer id){
       Brand brand= brandService.queryById(id);
        return ResultData.success(brand);
    }
    //路径：http://localhost:8080/api/brand/queryData?limit=2&page=1
    //参数:cid=2
    //返回值 ?limit=2&page=1
    //请求方式：get
    @GetMapping("queryData")
    public PageResult<Brand> queryData(BrandParams params){
        PageResult<Brand> rs= brandService.queryData(params);
        return rs;
    }



}

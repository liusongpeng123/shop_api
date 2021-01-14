package com.fh.shop.controller;

import com.fh.shop.entity.po.Peoperty;
import com.fh.shop.entity.vo.PageResult;
import com.fh.shop.entity.vo.PeopertyParams;
import com.fh.shop.entity.vo.ResultData;
import com.fh.shop.service.PeopertyService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("api/peoperty/")
public class PeopertyController {
    @Resource
    private PeopertyService peopertyService;
//路径：http://localhost:8080/api/peoperty/delete
    //参数:?id=4
    //返回值 {"code": 200,"message": "success","data": ""}
    //请求方式：post
    @PostMapping("delete")
public ResultData delete(Integer id){
    peopertyService.delete(id);
    return  ResultData.success("");
}
    //路径：http://localhost:8080/api/peoperty/addPeoperty
    //参数:?typeId=2&peopertyId=12&peopertyName=黑色&peopertyType=2&isSku=2&isDel=0&createDate=2020-02-02
    //返回值 {"code": 200,"message": "success","data": ""}
    //请求方式：post
   @PostMapping("addPeoperty")
    public ResultData  addPeoperty(Peoperty peoperty){
       peopertyService.addPeoperty(peoperty);
        return ResultData.success("");
   }
    //路径：http://localhost:8080/api/peoperty/updateById
    //参数:?id=2&peopertyId=100
    //返回值
    //请求方式：post
   @PostMapping("updateById")
    public ResultData updateById(Peoperty peoperty){
       peopertyService.updateById(peoperty);
        return ResultData.success("");
   }
    //路径：http://localhost:8080/api/peoperty/queryPeopertyData
    //参数:?limit=2&page=1
    //返回值"code": 0,  "msg": "",  "count": 3,"data": [{
    //            "id": 1,"peopertyId": 1,"peopertyName": "1",},{ } }]
    //请求方式：get
   @GetMapping("queryPeopertyData")
    public PageResult<Peoperty>queryPeopertyData(PeopertyParams params){
       PageResult<Peoperty> peo=peopertyService.queryPeopertyData(params);
       return peo;
   }
}

package com.fh.shop.controller;

import com.fh.shop.entity.vo.ResultData;
import com.fh.shop.service.PeopertyService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("api/peoperty/")
public class PeopertyController {
    @Resource
    private PeopertyService peopertyService;


    //http://localhost:8080/api/peoperty/delete
    @PostMapping("delete")
public ResultData delete(Integer id){
    peopertyService.delete(id);
    return  ResultData.success("");
}
}

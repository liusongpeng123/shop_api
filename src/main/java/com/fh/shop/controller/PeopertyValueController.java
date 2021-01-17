package com.fh.shop.controller;

import com.fh.shop.entity.vo.ResultData;
import com.fh.shop.service.PeopertyValueService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("api/peopertyValue/")
public class PeopertyValueController {
    @Resource
    private PeopertyValueService peopertyValueService;
    //http://localhost:8080/api/peopertyValue/deletePeopertyValue
@PostMapping("deletePeopertyValue")
    public ResultData deletePeopertyValue(Integer id){
    peopertyValueService.deletePeopertyValue(id);
    return ResultData.success("");
}

}

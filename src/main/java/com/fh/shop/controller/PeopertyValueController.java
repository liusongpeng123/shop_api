package com.fh.shop.controller;

import com.fh.shop.entity.po.PeopertyValue;
import com.fh.shop.entity.vo.ResultData;
import com.fh.shop.service.PeopertyValueService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

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
}//http://localhost:8080/api/peopertyValue/quertyPeopertyValueById
@GetMapping("quertyPeopertyValueById")
    public ResultData quertyPeopertyValueById(Integer id){
    PeopertyValue peopertyValue  =peopertyValueService.quertyPeopertyValueById(id);
    return  ResultData.success(peopertyValue);
}
@PostMapping("updatePeopertyValue")
    public ResultData updatePeopertyValue(PeopertyValue peopertyValue){
    peopertyValueService.updatePeopertyValue(peopertyValue);
    return ResultData.success("");
}
@PostMapping("addPeopertyValue")
   public ResultData addPeopertyValue(PeopertyValue peopertyValue){
    peopertyValueService.addPeopertyValue(peopertyValue);
    return ResultData.success("");
}
    //http://localhost:8080/api/peopertyValue/queryByPeoId
@GetMapping("queryByPeoId")
    public List<PeopertyValue> queryByPeoId(Integer peoId){
    List<PeopertyValue> list=   peopertyValueService.queryByPeoId(peoId);
    return list;
}
}

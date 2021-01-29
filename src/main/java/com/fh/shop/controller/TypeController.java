package com.fh.shop.controller;

import com.fh.shop.entity.po.Type;
import com.fh.shop.entity.vo.ResultData;
import com.fh.shop.service.TypeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/type/")
public class TypeController {
    @Resource
    private TypeService typeService;
    @GetMapping("getData")
    public ResultData getData(){
        List<Type> type = typeService.queryTypeData();
        return ResultData.success(type);
    }
    //http:localhost:8080/api/type/getDataByPid?pid=
    @PostMapping("getDataByPid")
    public ResultData getDataByPid(Integer pid){
        List<Type> type=typeService.queryDataByPid(pid);
        return ResultData.success(type);
    }
@PostMapping("update")
    public ResultData updated(Type type){
    typeService.update(type);
    return ResultData.success("");
}
@PostMapping("add")
    public ResultData add(Type type){
   Integer id= typeService.add(type);
   return  ResultData.success(id);
}
@DeleteMapping("deleteTypeById")
    public ResultData deleteTypeById(Integer id){
    typeService.deleteTypeById(id);
return ResultData.success("");
}
@GetMapping("queryById")
    public Type queryById(Integer id){
    Type type=  typeService.queryById(id);
    return type;
}
}

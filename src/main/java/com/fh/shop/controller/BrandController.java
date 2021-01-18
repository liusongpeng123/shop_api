package com.fh.shop.controller;

import com.fh.shop.entity.po.Brand;
import com.fh.shop.entity.vo.BrandParams;
import com.fh.shop.entity.vo.PageResult;
import com.fh.shop.entity.vo.ResultData;
import com.fh.shop.service.BrandService;
import com.fh.shop.utils.OssFileUtils;
import com.fh.shop.utils.UploadDown;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("api/brand/")
public class BrandController {
    @Resource
    private BrandService brandService;
    @Resource
    HttpServletRequest request;
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
    @PostMapping("upload")
    public ResultData upload(MultipartFile img){
        Map<String, String> map = UploadDown.upload(img,request, "imgFiles");
        String path=map.get("filePath");
        String pa="http://localhost:8080/"+path;
        return ResultData.success(pa);
    }
    @RequestMapping("load")
    public ResultData load (MultipartFile img)throws IOException{
        //处理新名称
        String originalFilename = img.getOriginalFilename();
        //防止中文引起的错误
        String newName= UUID.randomUUID().toString()+originalFilename.substring(originalFilename.lastIndexOf("."));
        //存储路径
        newName="imgs/"+newName;
        return ResultData.success(OssFileUtils.uploadFile(img.getInputStream(),newName));
    }
    //http://localhost:8080/api/brand/queryAllBrandData
@GetMapping("queryAllBrandData")
    public List<Brand> queryAllBrandData(){
    List<Brand> list=  brandService.queryAllBrandData();
    return  list;
}
}

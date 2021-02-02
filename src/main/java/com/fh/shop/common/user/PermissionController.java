package com.fh.shop.common.user;

import com.fh.shop.entity.po.Permission;
import com.fh.shop.entity.vo.ResultData;
import com.fh.shop.service.PermissionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/permission/")
public class PermissionController {
    @Resource
    private PermissionService permissionService;
    //路径：http://localhost:8080/api/permission/queryRoleById
    //参数:
    //返回值
    //请求方式：get
    @GetMapping("queryPermissionById")
    public Permission queryPermissionById (Integer id){
     Permission role=   permissionService.queryPermissionById(id);
     return  role;
    }
    //路径：http://localhost:8080/api/permission/queryPermission
    //参数:
    //返回值
    //请求方式：get
    @GetMapping("queryPermission")
    public ResultData queryPermission (){
       List<Permission>list= permissionService.queryPermission();
        return  ResultData.success(list);
    }
    //路径：http://localhost:8080/api/permission/deleteById
    //参数:
    //返回值
    //请求方式：post
    @PostMapping("deleteById")
    public ResultData deleteById(Integer id){
        permissionService.deleteById(id);
        return ResultData.success("");
    }
    //路径：http://localhost:8080/api/permission/addPermission
    //参数:
    //返回值
    //请求方式：post
    @PostMapping("addPermission")
    public ResultData addPermission (Permission permission) {
        permissionService.addPermission(permission);
     return   ResultData.success("");
    }
//路径：http://localhost:8080/api/permission/addPermission
    //参数:
    //返回值
    //请求方式：post
@PostMapping("updatePermission")
    public ResultData updatePermission(Permission permission){
    permissionService.updatePermission(permission);
    return ResultData.success("");
}
}

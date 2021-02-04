package com.fh.shop.common.user;

import com.fh.shop.entity.po.Role;
import com.fh.shop.entity.vo.ResultData;
import com.fh.shop.service.RoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/role/")
public class RoleController {
    @Resource
    private RoleService roleService;
    //路径：http://localhost:8080/api/role/deleteRole
    //参数:
    //返回值
    //请求方式：post
    @PostMapping("deleteRole")
    public ResultData deleteRole(Integer id){
        roleService.deleteRole(id);
        return ResultData.success("");
    }
    //路径：http://localhost:8080/api/role/addRole
    //参数:
    //返回值
    //请求方式：post
    @PostMapping("addRole")
    public ResultData addRole(Role role){
        roleService.addRole(role);
        return ResultData.success("");
    }
    //路径：http://localhost:8080/api/role/queryRoleById
    //参数:
    //返回值
    //请求方式：post
    @GetMapping("queryRoleById")
    public ResultData queryRoleById(Integer id){
      Role role=  roleService.queryRoleById(id);
        return ResultData.success(role);
    }
    //路径：http://localhost:8080/api/role/updateRole
    //参数:
    //返回值
    //请求方式：post
    @PostMapping("updateRole")
    public ResultData updateRole(Role role){
        roleService.updateRole(role);
        return ResultData.success("");
    }
    //路径：http://localhost:8080/api/role/queryRole
    //参数:
    //返回值
    //请求方式：get
    @GetMapping("queryRole")
    public ResultData queryRole(){
      List<Role>list= roleService.queryRole();
        return ResultData.success(list);
    }
}

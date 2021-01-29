package com.fh.shop.common.user;

import com.fh.shop.entity.po.User;
import com.fh.shop.entity.vo.ResultData;
import com.fh.shop.service.UserService;
import com.fh.shop.utils.OssFileUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("api/user/")
public class LoginController {
    @Resource
    private UserService userService;
    @RequestMapping("load")
    public ResultData load (MultipartFile img)throws IOException {
        //处理新名称
        String originalFilename = img.getOriginalFilename();
        //防止中文引起的错误
        String newName= UUID.randomUUID().toString()+originalFilename.substring(originalFilename.lastIndexOf("."));
        //存储路径
        newName="imgs/"+newName;
        return ResultData.success(OssFileUtils.uploadFile(img.getInputStream(),newName));
    }
    @PostMapping("addUser")
    public Map addUser(User user){
        Map map=new HashMap();
     User user1=userService.queryUserByName(user.getName());
     if(user1==null){
         user.setCreateDate(new Date());
         userService.addUser(user);
         map.put("message",300);
     }else{
         map.put("message",200);//账号已存在
     }
        return map;
    }
    @GetMapping("queryUserByName")
    public Map queryUserByName(String name,String password){
        Map map=new HashMap();
        User user1=userService.queryUserByName(name);
        if (user1!=null){
            if (user1.getPassword().equals(password)){
                map.put("message",200);// 100 密码错误，200 登录成功 300 账号不存在
            }else{
                map.put("message",100);
            }
        }else{
            map.put("message",300);//账号不存在
        }
        return map;
    }
}

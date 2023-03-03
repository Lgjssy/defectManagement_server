package com.example.demo.controller;

import com.example.demo.entity.Bug;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.mapper.bugMapper;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@RestController
@Slf4j
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @CrossOrigin
    @RequestMapping("/add")

    public Integer addNewUser(@RequestBody Map<String,String> map){
        int register1=1;
        for(int i=0;i<userMapper.FindId().size();i++){
            if(map.get("User_Id").equals(userMapper.FindId().get(i)))
                register1=2;
        }
        System.out.println(map.get("User_Password")+userMapper.FindPassword(map.get("User_Id")));
        if(register1==2){
            if(map.get("User_Password").equals(userMapper.FindPassword(map.get("User_Id")))){
                log.info("登陆成功！{}",map.get("User_Id"));
                return 0;
            }

            else
                return 2;
        }
       else
           return 1;
    }
    @CrossOrigin
    @RequestMapping("/register")

    public Integer addUser(@RequestBody Map<String,String> map){
        int register=0;
        for(int i=0;i<userMapper.FindId().size();i++){
            if(map.get("User_Id").equals(userMapper.FindId().get(i)))
                register=1;
        }
        if(register==1)
        {
            return 1;
        }
        else{
            User user1=new User(map.get("User_Id"),map.get("User_Name"),map.get("User_Password"),map.get("Position"));
            userMapper.addNewUser(user1);
            return 0;
        }
    }

}


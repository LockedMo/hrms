package com.hrms.controller;

import com.hrms.model.user;
import com.hrms.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/7 9:41
 */
@CrossOrigin
@ResponseBody
@Controller
@RequestMapping("/user")
public class LoginController {
    @Autowired
    private userService userService;

    @RequestMapping("/login")
    public Map<String,Object> login(String userId, String pwd){
        Map<String ,Object> map = new HashMap<String, Object>();
        user user = userService.getUserById(userId,pwd);
        map.put("user",user);
        System.out.println(user);
        System.out.println(map);
        return map;
    }

    @RequestMapping("/getCount")
    public int getCountbyTableName(String tableName){
        return userService.getCount(tableName);
    }
    @RequestMapping("/getUser")
    public List<user> getUser(){
        return userService.getUser();
    }
}

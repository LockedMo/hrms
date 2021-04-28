package com.hrms.controller;

import com.hrms.model.recruit;
import com.hrms.service.recruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/13 15:00
 */
@ResponseBody
@Controller
@RequestMapping("/recruit")
public class recruitController {
    @Autowired
    recruitService recruitService;
    @RequestMapping("/getRecruit")
    public List<recruit> getRecruit(int limit, int currentPage){
        return recruitService.getRecruit(limit,currentPage);
    }
    @RequestMapping("/insertRecruit")
    public boolean insertRecruit(@RequestBody recruit recruit){
        return recruitService.insertRecruit(recruit);
    }
    @RequestMapping("/deleteRecruit")
    public boolean deleteRecruit(String recId){
        return recruitService.deleteRecruit(recId);
    }
    @RequestMapping("/updateRecruit")
    public boolean updateRecruit(@RequestBody recruit recruit){
        return recruitService.updateRecruit(recruit);
    }
    @RequestMapping("/fuzzySelectRecruit")
    public List<recruit> fuzzySelectRecruit(@RequestBody recruit recruit){
        return recruitService.fuzzySelectRecruit(recruit);
    }

}

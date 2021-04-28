package com.hrms.controller;

import com.hrms.model.pv;
import com.hrms.service.pvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/27 16:33
 */
@Controller
@RequestMapping("/pv")
@ResponseBody
public class pvController {
    @Autowired
    pvService pvService;
    @RequestMapping("/addPv")
    public boolean addPv(){
        return pvService.addPv();
    }
    @RequestMapping("/selectPv")
    public List<pv> selectPV(){
        return pvService.selectPV();
    }
    @RequestMapping("/selectPvToday")
    public pv selectPVToday(){
        return pvService.selectPVToday();
    }
}

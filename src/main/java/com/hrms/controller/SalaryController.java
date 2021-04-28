package com.hrms.controller;

import com.hrms.model.salary;
import com.hrms.service.salaryService;
import org.bytedeco.javacpp.presets.opencv_core;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/12 18:10
 */
@ResponseBody
@Controller
@RequestMapping("/salary")
public class SalaryController {
    @Autowired
    salaryService salaryService;

    @RequestMapping("/getSalary")
    public List<salary> getSalary( int limit, int currentPage){
        return salaryService.getSalary(limit,currentPage);
    }

    @RequestMapping("/insertSalary")
    public boolean insertSalary(@RequestBody salary salary){
        return salaryService.insertSalary(salary);
    }

    @RequestMapping("/deleteSalary")
    public boolean deleteSalary(String salId){
        return salaryService.deleteSalary(salId);
    }

    @RequestMapping("/updateSalary")
    public boolean updateSalary(@RequestBody salary salary){
        return salaryService.updateSalary(salary);
    }

    @RequestMapping("/fuzzySelectSalary")
    public List<salary> fuzzySelectSalary(@RequestBody salary salary){
        return salaryService.fuzzySelectSalary(salary);
    }
}

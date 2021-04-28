package com.hrms.controller;

import com.hrms.model.staff;
import com.hrms.service.staffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/12 16:15
 */
@ResponseBody
@Controller
@RequestMapping("/staff")
public class StaffController {
    @Autowired
    staffService staffService;

    @RequestMapping("/getStaff")
    public List<staff> getStaff(int limit,int currentPage){
        return staffService.getStaff(limit,currentPage);
    }

    @RequestMapping("/insertStaff")
    public boolean insertStaff(@RequestBody staff staff){
        return staffService.insertStaff(staff);
    }

    @RequestMapping("/deleteStaff")
    public boolean deleteStaff(String staId){
        return staffService.deleteStaff(staId);
    }

    @RequestMapping("/updateStaff")
    public boolean updateStaff(@RequestBody staff staff){
        return  staffService.updateStaff(staff);
    }

    @RequestMapping("/fuzzySelectStaff")
    public List<staff> fuzzySelectStaff(@RequestBody staff staff){
        return staffService.fuzzySelectStaff(staff);
    }

    @RequestMapping("/getStaffBySecId")
    public List<staff> getStaffBySecId(String secId){
        return staffService.getStaffBySecId(secId);
    }
}

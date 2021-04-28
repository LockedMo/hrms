package com.hrms.controller;

import com.hrms.model.attendance;
import com.hrms.service.attendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/13 14:55
 */
@ResponseBody
@Controller
@RequestMapping("/attendance")
public class attendanceController {
    @Autowired
    attendanceService attendanceService;
    @RequestMapping("/getAttendance")
    public List<attendance> getAttendance(int limit,int currentPage){
        return attendanceService.getAttendance(limit,currentPage);
    }
    @RequestMapping("/insertAttendance")
    public boolean insertAttendance(@RequestBody attendance attendance){
        return attendanceService.insertAttendance(attendance);
    }
    @RequestMapping("/deleteAttendance")
    public boolean deleteAttendance(String attId){
        return attendanceService.deleteAttendance(attId);
    }
    @RequestMapping("/updateAttendance")
    public boolean updateAttendance(@RequestBody attendance attendance){
        return attendanceService.updateAttendance(attendance);
    }
    @RequestMapping("/fuzzySelectAttendance")
    public List<attendance> fuzzySelectAttendance(@RequestBody attendance attendance){
        return attendanceService.fuzzySelectAttendance(attendance);
    }

}

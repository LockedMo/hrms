package com.hrms.controller;

import com.hrms.model.job;
import com.hrms.service.jobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/12 18:51
 */
@ResponseBody
@Controller
@RequestMapping("/job")
public class JobController {
    @Autowired
    jobService jobService;
    @RequestMapping("/getJob")
    public List<job> getJob(int limit,int currentPage){
        return jobService.getJob(limit,currentPage);
    }

    @RequestMapping("/insertJob")
    public boolean insertJob(@RequestBody job job){
        return jobService.insertJob(job);
    }

    @RequestMapping("/deleteJob")
    public boolean deleteJob(String jobId){
        return jobService.deleteJob(jobId);
    }

    @RequestMapping("/updateJob")
    public boolean updateJob(@RequestBody job job){
        return jobService.updateJob(job);
    }

    @RequestMapping("/fuzzySelectJob")
    public List<job> fuzzySelectJob(@RequestBody job job){
        return jobService.fuzzySelectJob(job);
    }
}

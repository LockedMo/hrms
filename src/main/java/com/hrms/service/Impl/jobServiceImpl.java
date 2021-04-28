package com.hrms.service.Impl;

import com.hrms.dao.jobDao;
import com.hrms.model.job;
import com.hrms.service.jobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/12 18:49
 */
@Service("jobService")
public class jobServiceImpl implements jobService {
    @Autowired
    jobDao jobDao;
    @Override
    public List<job> getJob(int limit,int currentPage) {
        int current = limit*(currentPage-1);
        return jobDao.getJob(limit,currentPage,current);
    }

    @Override
    public boolean insertJob(job job) {
        return jobDao.insertJob(job);
    }

    @Override
    public boolean deleteJob(String jobId){
        return jobDao.deleteJob(jobId);
    }

    @Override
    public boolean updateJob(job job){
        return jobDao.updateJob(job);
    }

    @Override
    public List<job> fuzzySelectJob(job job) {
        return jobDao.fuzzySelectJob(job);
    }

}

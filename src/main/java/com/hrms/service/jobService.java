package com.hrms.service;

import com.hrms.model.job;

import java.util.List;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/12 18:49
 */
public interface jobService {
    public List<job> getJob(int limit,int currentPage);

    public boolean insertJob(job job);

    public boolean deleteJob(String jobId);

    public boolean updateJob(job job);
    /*模糊查询*/
    public List<job> fuzzySelectJob(job job);
}

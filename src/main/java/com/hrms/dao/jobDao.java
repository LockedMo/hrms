package com.hrms.dao;

import com.hrms.model.job;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/12 18:46
 */
public interface jobDao {
    /*查询全部职位*/
    public List<job> getJob(@Param("limit")int limit, @Param("currentPage") int currentPage, @Param("current") int current);
    /*新增职位*/
    public boolean insertJob(job job);
    /*删除职位*/
    public boolean deleteJob(String jobId);
    /*更新职位*/
    public boolean updateJob(job job);
    /*模糊查询*/
    public List<job> fuzzySelectJob(job job);
}

package com.hrms.dao;

import com.hrms.model.recruit;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/13 12:09
 */
public interface recruitDao {
    /*查询招聘信息*/
    public List<recruit> getRecruit(@Param("limit")int limit, @Param("currentPage") int currentPage, @Param("current") int current);
    /*新增招聘信息*/
    public boolean insertRecruit(recruit recruit);
    /*删除招聘信息*/
    public boolean deleteRecruit(String recId);
    /*更新招聘信息*/
    public boolean updateRecruit(recruit recruit);
    /*模糊查询*/
    public List<recruit> fuzzySelectRecruit(recruit recruit);
}

package com.hrms.service;

import com.hrms.model.recruit;

import java.util.List;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/13 14:49
 */
public interface recruitService {
    /*查询招聘信息*/
    public List<recruit> getRecruit(int limit,int currentPage);
    /*新增招聘信息*/
    public boolean insertRecruit(recruit recruit);
    /*删除招聘信息*/
    public boolean deleteRecruit(String recId);
    /*更新招聘信息*/
    public boolean updateRecruit(recruit recruit);

    public List<recruit> fuzzySelectRecruit(recruit recruit);

}

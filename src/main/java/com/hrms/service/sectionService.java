package com.hrms.service;

import com.hrms.model.section;

import java.util.List;
import java.util.Map;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/12 12:40
 */
public interface sectionService {
    /*获取部门信息*/
    public List<section> getSection(int limit,int currentPage);
    /*删除部门信息 by secId*/
    public boolean deleteSectionById(String secId);
    /*更新部门信息*/
    public boolean updateSection(section section);
    /*插入部门信息*/
    public boolean insertSection(section section);
    /*模糊查询部门信息*/
    public List<section> fuzzySelectSection(section section);;

}

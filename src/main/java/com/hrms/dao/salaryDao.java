package com.hrms.dao;

import com.hrms.model.salary;
import org.apache.ibatis.annotations.Param;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.List;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/12 18:03
 */
public interface salaryDao {
    /*查看全部薪资信息*/
    public List<salary> getSalary(@Param("limit")int limit, @Param("currentPage") int currentPage, @Param("current") int current);

    /*新增薪资*/
    public boolean insertSalary(salary salary);

    /*删除薪资*/
    public boolean deleteSalary(String salId);

    /*更新薪资*/
    public boolean updateSalary(salary salary);

    /*模糊查询*/
    public List<salary> fuzzySelectSalary(salary salary);
}

package com.hrms.service;

import com.hrms.model.salary;

import java.util.List;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/12 18:07
 */
public interface salaryService {
    public List<salary> getSalary(int limit,int currentPage);

    public boolean insertSalary(salary salary);

    public boolean deleteSalary(String salId);

    public boolean updateSalary(salary salary);
    /*模糊查询*/
    public List<salary> fuzzySelectSalary(salary salary);
}

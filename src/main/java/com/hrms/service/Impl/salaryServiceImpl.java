package com.hrms.service.Impl;

import com.hrms.dao.salaryDao;
import com.hrms.model.salary;
import com.hrms.service.salaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/12 18:08
 */
@Service("salaryService")
public class salaryServiceImpl implements salaryService {
    @Autowired
    salaryDao salaryDao;

    @Override
    public List<salary> getSalary(int limit,int currentPage) {
        int current = limit*(currentPage-1);
        return salaryDao.getSalary(limit,currentPage,current);
    }

    @Override
    public boolean insertSalary(salary salary) {
        return salaryDao.insertSalary(salary);
    }

    @Override
    public boolean deleteSalary(String salId) {
        return salaryDao.deleteSalary(salId);
    }

    @Override
    public boolean updateSalary(salary salary) {
        return salaryDao.updateSalary(salary);
    }

    @Override
    public List<salary> fuzzySelectSalary(salary salary) {
        return salaryDao.fuzzySelectSalary(salary);
    }
}

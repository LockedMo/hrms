package com.hrms.service;

import com.hrms.model.staff;

import java.util.List;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/12 16:12
 */
public interface staffService {
    public List<staff> getStaff(int limit,int currentPage);

    public boolean insertStaff(staff staff);

    public boolean deleteStaff(String staId);

    public boolean updateStaff(staff staff);

    public List<staff> fuzzySelectStaff(staff staff);

    /*根据部门号查找员工*/
    public List<staff> getStaffBySecId(String secId);

}

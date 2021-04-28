package com.hrms.dao;

import com.hrms.model.staff;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/12 16:07
 */
public interface staffDao {
    /*获取全部员工信息*/
    public List<staff> getStaff(@Param("limit")int limit, @Param("currentPage") int currentPage, @Param("current") int current);

    /*新增员工信息*/
    public boolean insertStaff(staff staff);

    /*删除员工信息*/
    public boolean deleteStaff(String staId);

    /*更新员工信息*/
    public boolean updateStaff(staff staff);

    /*模糊查找员工信息*/
    public List<staff> fuzzySelectStaff(staff staff);

    /*根据部门号查找员工*/
    public List<staff> getStaffBySecId(String secId);
}

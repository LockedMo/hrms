package com.hrms.dao;

import com.hrms.model.attendance;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/13 12:11
 */
public interface attendanceDao {
    /*查询缺勤信息*/
    public List<attendance> getAttendance(@Param("limit")int limit, @Param("currentPage") int currentPage, @Param("current") int current);
    /*新增缺勤信息*/
    public boolean insertAttendance(attendance attendance);
    /*删除缺勤信息*/
    public boolean deleteAttendance(String attId);
    /*更新缺勤信息*/
    public boolean updateAttendance(attendance attendance);
    /*模糊查询*/
    public List<attendance> fuzzySelectAttendance(attendance attendance);
}

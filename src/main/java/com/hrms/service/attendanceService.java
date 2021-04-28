package com.hrms.service;

import com.hrms.model.attendance;

import java.util.List;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/13 14:51
 */
public interface attendanceService {
    /*查询缺勤信息*/
    public List<attendance> getAttendance(int limit,int currentPage);
    /*新增缺勤信息*/
    public boolean insertAttendance(attendance attendance);
    /*删除缺勤信息*/
    public boolean deleteAttendance(String attId);
    /*更新缺勤信息*/
    public boolean updateAttendance(attendance attendance);
    /*模糊查询*/
    public List<attendance> fuzzySelectAttendance(attendance attendance);
}

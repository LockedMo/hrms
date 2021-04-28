package com.hrms.service.Impl;

import com.hrms.dao.attendanceDao;
import com.hrms.model.attendance;
import com.hrms.service.attendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/13 14:52
 */

@Service("attendanceService")
public class attendanceServiceImpl implements attendanceService {
    @Autowired
    attendanceDao attendanceDao;
    @Override
    public List<attendance> getAttendance(int limit,int currentPage) {
        int current = limit*(currentPage-1);
        return attendanceDao.getAttendance(limit,currentPage,current);
    }

    @Override
    public boolean insertAttendance(attendance attendance) {
        return attendanceDao.insertAttendance(attendance);
    }

    @Override
    public boolean deleteAttendance(String attId) {
        return attendanceDao.deleteAttendance(attId);
    }

    @Override
    public boolean updateAttendance(attendance attendance) {
        return attendanceDao.updateAttendance(attendance);
    }

    @Override
    public List<attendance> fuzzySelectAttendance(attendance attendance) {
        return attendanceDao.fuzzySelectAttendance(attendance);
    }


}

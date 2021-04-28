package com.hrms.service.Impl;

import com.hrms.dao.staffDao;
import com.hrms.model.staff;
import com.hrms.service.staffService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/12 16:13
 */
@Service("staffService")
public class staffServiceImpl implements staffService {
    @Autowired
    staffDao staffDao;
    @Override
    public List<staff> getStaff(int limit,int currentPage) {
        int current = limit*(currentPage-1);
        return staffDao.getStaff(limit,currentPage,current);
    }

    @Override
    public boolean insertStaff(staff staff) {
        return staffDao.insertStaff(staff);
    }

    @Override
    public boolean deleteStaff(String staId) {
        return staffDao.deleteStaff(staId);
    }

    @Override
    public boolean updateStaff(staff staff) {
        return staffDao.updateStaff(staff);
    }

    @Override
    public List<staff> fuzzySelectStaff(staff staff) {
        return staffDao.fuzzySelectStaff(staff);
    }

    @Override
    public List<staff> getStaffBySecId(String secId) {
        return staffDao.getStaffBySecId(secId);
    }


}

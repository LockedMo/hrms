package com.hrms.service.Impl;

import com.hrms.dao.recruitDao;
import com.hrms.model.recruit;
import com.hrms.service.recruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/13 14:50
 */
@Service("recruitService")
public class recruitServiceImpl implements recruitService {
    @Autowired
    recruitDao recruitDao;
    @Override
    public List<recruit> getRecruit(int limit,int currentPage) {
        int current = limit*(currentPage-1);
        return recruitDao.getRecruit(limit,currentPage,current);
    }

    @Override
    public boolean insertRecruit(recruit recruit) {
        return recruitDao.insertRecruit(recruit);
    }

    @Override
    public boolean deleteRecruit(String recId) {
        return recruitDao.deleteRecruit(recId);
    }

    @Override
    public boolean updateRecruit(recruit recruit) {
        return recruitDao.updateRecruit(recruit);
    }

    @Override
    public List<recruit> fuzzySelectRecruit(recruit recruit) {
        return recruitDao.fuzzySelectRecruit(recruit);
    }
}

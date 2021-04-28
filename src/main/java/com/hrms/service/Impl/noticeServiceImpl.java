package com.hrms.service.Impl;

import com.hrms.dao.noticeDao;
import com.hrms.model.notice;
import com.hrms.service.noticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/12 19:38
 */
@Service("noticeService")
public class noticeServiceImpl implements noticeService {
    @Autowired
    noticeDao noticeDao;
    @Override
    public List<notice> getNotice(int limit,int currentPage) {
        int current = limit*(currentPage-1);
        return noticeDao.getNotice(limit,currentPage,current);
    }

    @Override
    public boolean insertNotice(notice notice) {
        return noticeDao.insertNotice(notice);
    }

    @Override
    public boolean deleteNotice(String notId) {
        return noticeDao.deleteNotice(notId);
    }

    @Override
    public boolean updateNotice(notice notice) {
        return noticeDao.updateNotice(notice);
    }

    @Override
    public List<notice> fuzzySelectNotice(notice notice) {
        return noticeDao.fuzzySelectNotice(notice);
    }
}

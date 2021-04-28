package com.hrms.service;

import com.hrms.model.notice;

import java.util.List;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/12 19:37
 */
public interface noticeService {
    public List<notice> getNotice(int limit,int currentPage);

    public boolean insertNotice(notice notice);

    public boolean deleteNotice(String notId);

    public boolean updateNotice(notice notice);

    public List<notice> fuzzySelectNotice(notice notice);
}

package com.hrms.dao;

import com.hrms.model.notice;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/12 19:20
 */
public interface noticeDao {
    /*获取全部公告信息*/
    public List<notice> getNotice(@Param("limit")int limit, @Param("currentPage") int currentPage, @Param("current") int current);
    /*新增公告*/
    public boolean insertNotice(notice notice);
    /*删除公告*/
    public boolean deleteNotice(String notId);
    /*修改公告*/
    public boolean updateNotice(notice notice);
    /*模糊查询*/
    public List<notice> fuzzySelectNotice(notice notice);
}

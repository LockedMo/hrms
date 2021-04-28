package com.hrms.service;

import com.hrms.model.user;

import java.util.List;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/9 16:49
 */
public interface userService {
    public user getUserById(String userId,String pwd);

    /*获取表的记录总数*/
    public int getCount(String tableName);

    public List<user> getUser();
}

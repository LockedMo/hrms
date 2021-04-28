package com.hrms.service.Impl;

import com.hrms.dao.userDao;
import com.hrms.model.user;
import com.hrms.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/9 16:50
 */
@Transactional
@Service("userService")
public class userServiceImpl implements userService {
    @Autowired
    private userDao userDao1;

    @Override
    public user getUserById(String userId, String pwd) {
        System.out.println(userDao1);
        user user = userDao1.getUserById(userId,pwd);
        return user;
    }

    @Override
    public int getCount(String tableName) {
        return userDao1.getCount(tableName);
    }

    @Override
    public List<user> getUser() {
        return userDao1.getUser();
    }
}

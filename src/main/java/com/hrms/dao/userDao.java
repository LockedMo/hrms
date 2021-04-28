package com.hrms.dao;

import com.hrms.model.user;
import javafx.beans.DefaultProperty;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/9 16:52
 */

public interface userDao {
    /*根据用户名密码登录*/
    public user getUserById(@Param("userId") String userId,@Param("pwd") String pwd);
    /*获取某表记录总数*/
    public int getCount(@Param("tableName") String tableName);
    /*获取全部用户信息*/
    @Select("select * from user")
    public List<user> getUser();
}

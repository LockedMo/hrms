package com.hrms.dao;

import com.hrms.model.pv;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/27 16:19
 */
public interface pvDao {
    /*新增访问量*/
    @Update("update pv set num = num+1 where date=DATE(CURDATE())")
    public boolean addPv();

    /*查询总访问量*/
    @Select("select * from pv where date<DATE(CURDATE())")
    public List<pv> selectPV();

    /*查询当日访问量*/
    @Select("select * from pv where date = DATE(CURDATE())")
    public pv selectPVToday();
}

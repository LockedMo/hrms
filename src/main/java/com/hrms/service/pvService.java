package com.hrms.service;

import com.hrms.model.pv;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/27 16:31
 */
public interface pvService {
    /*新增访问量*/
    public boolean addPv();
    /*查询总访问量*/
    public List<pv> selectPV();
    /*查询当日访问量*/
    public pv selectPVToday();
}

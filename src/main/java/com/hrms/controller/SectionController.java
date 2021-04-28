package com.hrms.controller;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hrms.dao.sectionDao;
import com.hrms.model.section;
import com.hrms.service.sectionService;
import com.mysql.cj.xdevapi.JsonArray;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/12 12:44
 */
@ResponseBody
@Controller
@RequestMapping("/section")
public class SectionController {
    @Autowired
    sectionService sectionService;

    @RequestMapping("/getSection")
    public List<section> getSection( int limit, int currentPage){
        return sectionService.getSection(limit,currentPage);
    }

    @RequestMapping("/deleteSectionById")
    public boolean deleteSectionById(String secId){
        return sectionService.deleteSectionById(secId);
    }

    @RequestMapping("/updateSection")
    public boolean updateSection(@RequestBody section section){
        return sectionService.updateSection(section);
    }

    @RequestMapping("/insertSection")
    public boolean insertSection(@RequestBody section section){return sectionService.insertSection(section);}

    @RequestMapping("/fuzzySelectSection")
    public List<section> fuzzySelectSection(@RequestBody section section){
        return sectionService.fuzzySelectSection(section);
    }

}

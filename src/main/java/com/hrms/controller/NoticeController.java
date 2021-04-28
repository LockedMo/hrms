package com.hrms.controller;

import com.hrms.model.notice;
import com.hrms.service.noticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/12 19:39
 */
@ResponseBody
@Controller
@RequestMapping("/notice")
public class NoticeController {
    @Autowired
    noticeService noticeService;
    @RequestMapping("/getNotice")
    public List<notice> getNotice( int limit, int currentPage){
        return noticeService.getNotice(limit,currentPage);
    }

    @RequestMapping("/insertNotice")
    public boolean insertNotice(@RequestBody notice notice){
        return noticeService.insertNotice(notice);
    }
    @RequestMapping("/deleteNotice")
    public boolean deleteNotice(String notId){
        return noticeService.deleteNotice(notId);
    }

    @RequestMapping("/updateNotice")
    public boolean updateNotice(@RequestBody notice notice){
        return noticeService.updateNotice(notice);
    }

    @RequestMapping("/fuzzySelectNotice")
    public List<notice> fuzzySelectNotice(@RequestBody notice notice){
        return noticeService.fuzzySelectNotice(notice);
    }

}

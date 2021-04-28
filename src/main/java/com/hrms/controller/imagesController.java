package com.hrms.controller;

import com.hrms.model.images;
import com.hrms.service.imagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/26 18:42
 */
@Controller
@RequestMapping("/images")
@ResponseBody
public class imagesController {
    @Autowired
    imagesService imagesService;
    @RequestMapping("/insertImages")
    public Map<String, Object> insertImages(@RequestBody images images){
        return imagesService.insertImages(images);
    }
    @RequestMapping("/deleteImages")
    public Map<String, Object> deleteImages(String staId) {
        return imagesService.deleteImages(staId);
    }
    @RequestMapping("/updateImages")
    public Map<String,Object> updateImages(@RequestBody images images){return imagesService.updateImages(images);}
}

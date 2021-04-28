package com.hrms.service.Impl;

import com.hrms.dao.imagesDao;
import com.hrms.model.images;
import com.hrms.service.imagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/26 18:15
 */
@Service("imagesService")
public class imagesServiceImpl implements imagesService {
    @Autowired
    imagesDao imagesDao;
    @Override
    public Map<String, Object> insertImages(images images) {
        Map<String,Object> map = new HashMap<String, Object>();
        boolean insertImages = imagesDao.insertImages(images);
        if(insertImages){
            map.put("result","success");
            map.put("msg","头像更新成功");
            return map;
        }else {
            map.put("result","fail");
            map.put("msg","头像更新失败");
            return map;
        }
    }

    @Override
    public Map<String, Object> deleteImages(String staId) {
        Map<String,Object> map = new HashMap<String, Object>();
        boolean deleteImages = imagesDao.deleteImages(staId);
        if(deleteImages){
            map.put("result","success");
            map.put("msg","头像删除成功");
            return map;
        }else {
            map.put("result","fail");
            map.put("msg","头像删除失败");
            return map;
        }
    }

    @Override
    public Map<String, Object> updateImages(images images) {
        Map<String,Object> map = new HashMap<String, Object>();
        boolean updateImages = imagesDao.updateImages(images);
        if(updateImages){
            map.put("result","success");
            map.put("msg","头像更新成功");
            return map;
        }else {
            map.put("result","fail");
            map.put("msg","头像更新失败");
            return map;
        }
    }
}

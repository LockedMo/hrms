package com.hrms.service;

import com.hrms.model.images;

import java.util.Map;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/26 18:12
 */
public interface imagesService {
    public Map<String,Object> insertImages(images images);

    public Map<String,Object> deleteImages(String staId);

    public Map<String,Object> updateImages(images images);
}

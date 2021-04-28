package com.hrms.dao;

import com.hrms.model.images;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/26 17:43
 */
public interface imagesDao {
    /*保存图片*/
    @Insert("insert images values (#{staId},#{url})")
    public boolean insertImages(images images);
    /*删除图片*/
    @Delete("delete from images where staId = #{staId}")
    public boolean deleteImages(String staId);
    /*更新图片*/
    @Update("update images set url=#{url} where staId=#{staId}")
    public boolean updateImages(images images);
}

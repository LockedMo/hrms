package com.hrms.dao;

import com.hrms.model.section;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.bytedeco.javacpp.presets.opencv_core;

import java.util.List;
import java.util.Map;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/12 12:37
 */
public interface sectionDao {
    public List<section> getSection(@Param("limit")int limit, @Param("currentPage") int currentPage, @Param("current") int current);

    public boolean deleteSectionById(String secId);

    public boolean updateSection(section section);

    public boolean insertSection(section section);

    public List<section> fuzzySelectSection(section section);;
}

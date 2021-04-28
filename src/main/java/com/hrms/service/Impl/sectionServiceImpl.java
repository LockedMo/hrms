package com.hrms.service.Impl;

import com.hrms.model.section;
import com.hrms.service.sectionService;
import org.springframework.beans.factory.annotation.Autowired;
import com.hrms.dao.sectionDao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/12 12:41
 */
@Service("sectionService")
public class sectionServiceImpl implements sectionService {
    @Autowired
    sectionDao sectionDao;

    @Override
    public List<section> getSection(int limit,int currentPage) {
        int current = limit*(currentPage-1);
        return sectionDao.getSection(limit,currentPage,current);
    }

    @Override
    public boolean deleteSectionById(String secId) {
        return  sectionDao.deleteSectionById(secId);
    }

    @Override
    public boolean updateSection(section section) {
        return sectionDao.updateSection(section);
    }

    @Override
    public boolean insertSection(section section) {
        return sectionDao.insertSection(section);
    }

    @Override
    public List<section> fuzzySelectSection(section section) {
        return sectionDao.fuzzySelectSection(section);
    }


}

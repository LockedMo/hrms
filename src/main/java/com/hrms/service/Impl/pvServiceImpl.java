package com.hrms.service.Impl;

import com.hrms.dao.pvDao;
import com.hrms.model.pv;
import com.hrms.service.pvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.soap.Addressing;
import java.util.List;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/27 16:32
 */
@Service("pvService")
public class pvServiceImpl implements pvService {
    @Autowired
    pvDao pvDao;
    @Override
    public boolean addPv() {
        return pvDao.addPv();
    }

    @Override
    public List<pv> selectPV() {
        return pvDao.selectPV();
    }

    @Override
    public pv selectPVToday() {
        return pvDao.selectPVToday();
    }
}

package com.huizhi.oa.service.impl;

import com.huizhi.oa.dao.LeaveinfoMapper;
import com.huizhi.oa.entity.Leaveinfo;
import com.huizhi.oa.service.LeaveinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LeaveinfoServiceImpl implements LeaveinfoService {

    @Autowired
    private LeaveinfoMapper leaveinfoMapper;

    @Override
    public int deleteByPrimaryKey(String lId) {
        return leaveinfoMapper.deleteByPrimaryKey(lId);
    }

    @Override
    public int insert(Leaveinfo record) {
        return leaveinfoMapper.insert(record);
    }

    @Override
    public int insertSelective(Leaveinfo record) {
        return leaveinfoMapper.insertSelective(record);
    }

    @Override
    public Leaveinfo selectByPrimaryKey(String lId) {
        return leaveinfoMapper.selectByPrimaryKey(lId);
    }

    @Override
    public int updateByPrimaryKeySelective(Leaveinfo record) {
        return leaveinfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Leaveinfo record) {
        return leaveinfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Leaveinfo> getAllLeaveInfo() {
        return leaveinfoMapper.getAllLeaveInfo();
    }
}
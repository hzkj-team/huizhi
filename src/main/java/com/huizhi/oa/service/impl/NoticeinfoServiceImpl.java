package com.huizhi.oa.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huizhi.oa.dao.NoticeinfoMapper;
import com.huizhi.oa.entity.Noticeinfo;
import com.huizhi.oa.service.NoticeinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeinfoServiceImpl implements NoticeinfoService {

    @Autowired
    private NoticeinfoMapper noticeinfoMapper;

    @Override
    public int deleteByPrimaryKey(Integer nId) {
        return noticeinfoMapper.deleteByPrimaryKey(nId);
    }

    @Override
    public int insert(Noticeinfo record) {
        return noticeinfoMapper.insert(record);
    }

    @Override
    public int insertSelective(Noticeinfo record) {
        return noticeinfoMapper.insertSelective(record);
    }

    @Override
    public Noticeinfo selectByPrimaryKey(Integer nId) {
        return noticeinfoMapper.selectByPrimaryKey(nId);
    }

    @Override
    public int updateByPrimaryKeySelective(Noticeinfo record) {
        return noticeinfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Noticeinfo record) {
        return noticeinfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Noticeinfo> getAllNoticeinfo() {
        return noticeinfoMapper.getAllNoticeinfo();
    }

    @Override
    public PageInfo<Noticeinfo> selectNoticeinfoALL(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Noticeinfo> list=noticeinfoMapper.getAllNoticeinfo();
        return new PageInfo<>(list);
    }
}

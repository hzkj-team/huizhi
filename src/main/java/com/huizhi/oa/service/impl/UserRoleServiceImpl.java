package com.huizhi.oa.service.impl;

import com.huizhi.oa.dao.UserRoleMapper;
import com.huizhi.oa.entity.UserRole;
import com.huizhi.oa.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * created by dwtuitfk on 2019/2/17.
 */
@Service
@Transactional
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleMapper userRoleMapper;


    @Override
    public int insert(UserRole record) {
        return userRoleMapper.insert(record);
    }

    @Override
    public int insertSelective(UserRole record) {
        return userRoleMapper.insertSelective(record);
    }

    @Transactional(propagation= Propagation.NOT_SUPPORTED)
    @Override
    public UserRole getUserRoleinfo(Integer roleid) {
        return userRoleMapper.getUserRoleinfo(roleid);
    }

    @Override
    public int delUserRoleinfo(Integer roleid) {
        return userRoleMapper.delUserRoleinfo(roleid);
    }

    @Override
    public List<UserRole> getAllUserRoleinfo(Integer roleid) {
        return userRoleMapper.getAllUserRoleinfo(roleid);
    }
}

package com.sli.service.impl;

import com.sli.entity.User;
import com.sli.mapper.UserMapper;
import com.sli.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    public UserMapper userMapper;

    @Override
    public List<User> selectAllUserAndDeptAndRole() {
        return userMapper.selectAllUserAndDeptAndRole();
//        return null;
    }

}

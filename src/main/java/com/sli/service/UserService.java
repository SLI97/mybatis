package com.sli.service;

import com.sli.entity.User;

import java.util.List;

public interface UserService {

    public List<User> selectAllUserAndDeptAndRole();
}

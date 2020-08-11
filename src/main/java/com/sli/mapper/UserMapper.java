package com.sli.mapper;

import com.sli.entity.User;

import java.util.List;

public interface UserMapper {

    public User selectUserById(Integer id);
    public List<User> selectAllUser();
    public int addUser(User user);
    public int updateUser(User user);
    public int deleteUser(Integer id);
}

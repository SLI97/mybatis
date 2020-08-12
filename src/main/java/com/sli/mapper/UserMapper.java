package com.sli.mapper;

import com.sli.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

//    @Select("SELECT * FROM user where id = #{id}")
    public User selectUserById(Integer id);

    public List<User> selectUserList(User user);

//    @Select("SELECT * FROM user")
    public List<User> selectAllUser();

    public List<User> selectAllUserAndDept();

    public int addUser(User user);
    public int updateUser(User user);
    public int deleteUser(Integer id);
}

package com.sli.mapper;

import com.sli.entity.Dept;

import java.util.List;

public interface DeptMapper {

    //    @Select("SELECT * FROM user where id = #{id}")
    public Dept selectDeptById(Integer id);

    //    @Select("SELECT * FROM user")
    public List<Dept> selectAllDept();

    public int addDept(Dept dept);
    public int updateDept(Dept dept);
    public int deleteDept(Integer id);
}

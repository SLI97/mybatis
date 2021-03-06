package com.sli.entity;

import java.util.List;

public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String email;
    private Dept dept;

    private List<Role> roleList;

    public User() {
    }

    public User(Integer id, String name, Integer age, String email, Dept dept, List<Role> roleList) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.dept = dept;
        this.roleList = roleList;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", dept=" + dept +
                ", roleList=" + roleList +
                '}';
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }
}

package com.sli.ThreadTest;

import com.sli.entity.User;
import com.sli.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
//指定配置文件路径
@ContextConfiguration(locations = {"/spring/spring-*.xml"})
public class MySpringTest {

    @Autowired
    private UserService userService;

    @Autowired
    private ApplicationContext ioc;

    @Test
    public void TestService(){
//        System.out.println(ioc);
        List<User> users = userService.selectAllUserAndDeptAndRole();
        System.out.println(users);
    }
}

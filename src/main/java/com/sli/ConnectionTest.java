package com.sli;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//注意这里导包是用java中的sql包的接口而不是mysql包的实现类

import com.sli.entity.User;
import com.sli.jdbc.SpringConfig;
import com.sli.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

//获取数据库连接对象
public class ConnectionTest {
    @Test
    public void jdbc() throws Exception {
        //1.加载注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false", "root", "123456");//此时参数为数据库的url,账号,密码

        //3.创建语句对象
        PreparedStatement st = conn.prepareStatement(
                "delete FROM user where id = 4");
        //4.执行sql语句
//        st.
        boolean execute = st.execute();
        System.out.println(execute);
        //5.释放资源(后开先关)
        st.close();
        conn.close();
    }

//    @Autowired
//    private JdbcTemplate jdbcTemplate;

    @Test
    public void jdbctemplate123() throws Exception {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        JdbcTemplate jdbcTemplate = ac.getBean("jdbcTemplate",JdbcTemplate.class);
//        List<User> query = jdbcTemplate.query("select * from user where id = 2", new BeanPropertyRowMapper<User>(User.class));
        User user = jdbcTemplate.queryForObject("select name from user where id = ?", new BeanPropertyRowMapper<User>(User.class),2);
        System.out.println(user);
        Map<String, Object> map = jdbcTemplate.queryForMap("SELECT * FROM user WHERE id=?", 3);
        System.out.println(map);
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("SELECT * FROM user");
        System.out.println(maps);
        List<User> users = jdbcTemplate.query("SELECT * FROM user",new BeanPropertyRowMapper<User>(User.class));
        System.out.println(users);

    }

    @Test
    public void haha() throws IOException {
        String resource = "sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
//        User users =  sqlSession.selectOne("com.sli.mapper.UserMapper.selectUserById",3);//传入pojo包装类
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        User users = mapper.selectUserById(3);
//        List<User> users1 = mapper.selectAllUser();
//        User user = new User();
//        user.setId(5);
//        user.setName("may");
//        user.setAge(11);
//        user.setEmail("email@may");
        List<User> users = mapper.selectAllUserAndDeptAndRole();
//        int i = mapper.addUser(user);
//        int i = mapper.updateUser(user);
        System.out.println(users);
        sqlSession.commit();
        sqlSession.close();
    }
}
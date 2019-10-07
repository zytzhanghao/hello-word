package com.zyt;

import com.zyt.dao.UserMapper;
import com.zyt.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot05MybatisApplicationTests {

    @Autowired
    UserMapper userMapper;


    @Test
    public void userTest(){

        List<User> list = new ArrayList<User>() ;
        list = userMapper.getAllUser();
//        for (int i = 0; i < 5; i++) {
//            System.out.println( list.get(i).getId());
//
//        }


//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()) {
//            //iterator.next();
//            System.out.println(iterator.next());
//        }




    }


    @Test
    public void contextLoads() {
    }



}

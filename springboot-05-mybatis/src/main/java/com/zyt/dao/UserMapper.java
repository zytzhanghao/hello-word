package com.zyt.dao;

import com.zyt.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

    @Select("select id,age,password,sex,user_name from user")
    public List<User> getAllUser();

    @Select("select * from user where id=#{id}")
    public User getUserByid(Integer id);


    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into user(age,password,sex,user_name) values(#{age},#{passWord},#{sex},#{userName}) ")
    public  int inserUser(User user);

    public void deleteuser(Integer id);

    public void updateuser(User user);
}

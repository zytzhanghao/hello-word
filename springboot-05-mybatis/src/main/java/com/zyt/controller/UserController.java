package com.zyt.controller;

import com.zyt.dao.UserMapper;
import com.zyt.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    UserMapper userMapper;



//     this.getRequest("/employee/basic/emp?page=" + this.currentPage + "&size=10&keywords=" + this.keywords + "&politicId=" + this.emp.politicId + "&nationId=" + this.emp.nationId + "&posId=" + this.emp.posId + "&jobLevelId=" + this.emp.jobLevelId + "&engageForm=" + this.emp.engageForm + "&departmentId=" + this.emp.departmentId + "&beginDateScope=" + this.beginDateScope).then(resp => {
//        this.tableLoading = false;
//        if (resp && resp.status == 200) {
//            var data = resp.data;
//            _this.emps = data.emps;
//            _this.totalCount = data.count;
////            _this.emptyEmpData();
//        }

    @ResponseBody
    @GetMapping("/getuser")
    public Map<String ,Object> getAllUser(){
        Map<String,Object> map =new HashMap<String,Object>();
        List<User> list =userMapper.getAllUser();

        map.put("list", list);
        return  map ;
    }


    @ResponseBody
    @GetMapping("/getuser/{id}")
    public User getUserById(@PathVariable("id") Integer id){

        User user =userMapper.getUserByid(id);

        return  user;
    }


    @ResponseBody
    @GetMapping("/insertuser")
    public int  insertUser(){
        User user =new User();
        user.setAge(123);
        user.setPassWord("Tset");
        user.setSex(2);
        user.setUserName("zhangyutong");
        userMapper.inserUser(user);
        return 1;

    }

    @GetMapping("/updateuser/{id}")
    public void update(@PathVariable("id") Integer id){
        User user =new User();
        user.setId(id);
        user.setAge(123);
        user.setPassWord("Tset");
        user.setSex(2);
        user.setUserName("updatetest");
        userMapper.updateuser(user);

    }

    @GetMapping("/deleteuser/{id}")
    public void deleteuser(@PathVariable("id")Integer id){
        userMapper.deleteuser(id);
    }

}

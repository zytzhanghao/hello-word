package com.zyt.entity;

public class User {
    public Integer id;
    public Integer age;
    public String passWord;
    public Integer sex;
    public  String userName;

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getPassWord() {
        return passWord;
    }

    public int getSex() {
        return sex;
    }

    public String getUserName() {
        return userName;
    }
}

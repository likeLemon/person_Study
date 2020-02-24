package com.example.demo.beans;

public class User {

    /*用户编号*/
    private int id;
    /*用户姓名*/
    private String name;
    /*用户年龄*/
    private int age;
    /*用户密码*/
    private String password;
    /*用户邮箱*/
    private String email;

    public User() {
    }


    public User(String name, int age, String password, String email) {
        this.name = name;
        this.age = age;
        this.password = password;
        this.email = email;
    }

    public User(int id, String name, int age, String password, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

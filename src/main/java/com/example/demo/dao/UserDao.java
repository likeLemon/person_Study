package com.example.demo.dao;
import com.example.demo.beans.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface UserDao {

    /*添加用户*/
    @Insert("insert into t_user values(#{id},#{name},#{age},#{password},#{email})")
    void addUser(User user);

    /*修改用户信息*/
    @Update("update t_user set name=#{name},age=#{age},password=#{password},email=#{email} where id=#{id}")
    void updateUser(User user);

    /*删除用户*/
    @Delete("delete from t_user where id=#{id}")
    void deleteUser(int id);

    /*根据姓名查用户信息*/
    @Select("select * from t_user where name=#{username}")
    User findByName(@Param("userName") String userName);

    /*查询所有*/

    @Select("select * from t_user")
    List<User> findAll();

    @Select("select * from t_user")
    List<User> findPage();

}

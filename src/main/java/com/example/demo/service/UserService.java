package com.example.demo.service;

import com.example.demo.beans.User;
import com.example.demo.utils.PageRequest;
import com.example.demo.utils.PageResult;
import com.example.demo.utils.PageUtils;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    boolean addUser(User user);

    boolean updateUser(User user);

    boolean deleteUser(int id);

    User findByName(String userName);

    List findAll();

    PageResult findPage(PageRequest pageRequest);

}

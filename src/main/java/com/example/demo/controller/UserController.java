package com.example.demo.controller;

import com.example.demo.beans.User;
import com.example.demo.service.UserService;
import com.example.demo.utils.PageRequest;
import com.example.demo.utils.PageResult;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Admin")
public class UserController {

    /**
     *
     */
    @Autowired
    private UserService userService;

    @PutMapping("/addUser")
    public boolean addUser(User user){
        System.out.println("添加用户");
        return userService.addUser(user);
    }
    @DeleteMapping("/deleteUser")
    public boolean deleteUser(int id){
        System.out.println("删除用户");
        return userService.deleteUser(id);
    }
    @GetMapping("/findAll")
    public List<User> findAll(Model model,@RequestParam(value = "start",defaultValue = "0")int start,@RequestParam(value = "size",defaultValue = "5")int size){
        System.out.println("查询用户");
        return userService.findAll();
    }

    @GetMapping("/findPage")
    public PageResult findPage(@RequestBody PageRequest pageQuery){
        return userService.findPage(pageQuery);

    }

}

package com.example.demo;
import com.example.demo.beans.User;
import com.example.demo.service.UserService;
import com.example.demo.service.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class AddUserTest {

    @Autowired
    UserServiceImpl userService;

    @Test
    public void addUser() {
        userService.addUser(new User("haha",23,"123456","13015475375@163.com"));
        }

        @Test
    public void findAll(){
        System.out.println(userService.findAll());
    }
}


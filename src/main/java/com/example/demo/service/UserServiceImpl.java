package com.example.demo.service;

import com.example.demo.beans.User;

import com.example.demo.dao.UserDao;
import com.example.demo.utils.PageRequest;
import com.example.demo.utils.PageResult;
import com.example.demo.utils.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
     private UserDao userDao;

    @Override
    public boolean addUser(User user) {
        boolean flag=false;
        try {
            userDao.addUser(user);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateUser(User user) {
        boolean flag=false;
        try {
            userDao.updateUser(user);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteUser(int id) {
        boolean flag=false;
        try {
            userDao.deleteUser(id);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public User findByName(String userName) {
        return userDao.findByName(userName);
    }

    @Override
    public List findAll() {
        return userDao.findAll();
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return PageUtils.getPageResult(pageRequest,getPageInfo(pageRequest));
    }


    /**
     * 调用分页插件完成分页
     * @return
     */
    private  PageInfo<User> getPageInfo(PageRequest pageRequest) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<User> sysMenus = userDao.findPage();
        return new PageInfo<User>(sysMenus);
    }

}

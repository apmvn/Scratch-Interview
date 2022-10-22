package com.dragon.interview.user.service;


import com.dragon.interview.user.entity.User;
import com.dragon.interview.user.mapper.UserMapper;
import com.dragon.interview.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xiaoyuan
 * @Date: 2022/10/21/9:00
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    //md5加密规则
    private String getMd5(String userName,String userPass){
        for (int i = 0; i <3 ; i++) {
            userPass = DigestUtils.md5DigestAsHex((userPass ).getBytes()).toUpperCase();
        }
        return userPass;
    }
    //==========后台=========

    //根据Id进行查询
    @Override
    public User getUserId(Integer userId) {
        User user = userMapper.getUserId (userId);
        return user;
    }

    //根据姓名进行查询
    @Override
    public User getUserName(String userName) {
        User name = getUserName (userName);
        return name;
    }

    //根据姓名进行模糊查询
    @Override
    public List<User> getUserByLike(String userName) {
        List<User> user = userMapper.getUserByLike (userName);
        return user;
    }

    //查询所有用户
    @Override
    public List<User> getAllUser() {
        List<User> allUser = userMapper.getAllUser ();
        return allUser;
    }

    //批量删除
    @Override
    public int deleteUsersId(Integer[] userIds) {
        int deleteUsersId = userMapper.deleteUsersId (userIds);
        return deleteUsersId;
    }

    //根据ID进行删除
    @Override
    public int deleteUserId(Integer userId) {
        int user = userMapper.deleteUserId (userId);
        return user;
    }

    //修改性别
    @Override
    public int updateUserSex(Integer userId, char sex) {
        int userSex = userMapper.updateUserSex (userId, sex);
        return userSex;
    }
    //=========前台=============
    //注册用户
    @Override
    public int insertUser(User user) {
        String userName = user.getUserName ();
        User name = userMapper.getUserName (userName);
        String md5Password = getMd5(user.getUserPass (),user.getUserName ());
        user.setUserPass (md5Password);
        if (name==null){
            int number = userMapper.insertUser (user);
            return number;
        }
        return 0;
    }


    //登录验证
    @Override
    public User login(String userName, String userPass) {
        String md5Password = getMd5(userName,userPass);
        if (userName!=null){
            User login = userMapper.login (userName, md5Password);
            return login;
        }
        return null;
    }

    //用户修改
    @Override
    public int updateUser(User user) {
        String userName = user.getUserName ();
        int i = userMapper.updateUser ( user);
        String md5Password = getMd5(user.getUserPass (),user.getUserName ());
        user.setUserPass (md5Password);
        if (user.getUserName ()!=null){
            int number = userMapper.updateUser (user);
            return number;
        }
        return 0;
    }

}


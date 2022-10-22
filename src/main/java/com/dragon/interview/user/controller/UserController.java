package com.dragon.interview.user.controller;


import com.dragon.interview.user.entity.User;
import com.dragon.interview.user.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xiaoyuan
 * @Date: 2022/10/21/9:18
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    //=============后台=================

    /**
     * 模糊查询用户名
     * @param
     * @return
     */
    @PostMapping("/select")
    public  List<User> selectUser(@RequestParam String userName){
        List<User> userByLike = userService.getUserByLike (userName);
        return userByLike;
    }
    /**
     * 查询所有用户
     * @return
     */
    @PostMapping("allusers")
    public List<User> allUsers(){
        List<User> users = userService.getAllUser ();
        return users;
    }
    /**
     * 根据id删除用户
     * @param
     * @return
     */
    @PostMapping("delete")
    public int deleteUserId(@RequestParam Integer userId){
        int data = userService.deleteUserId (userId);
        return data;
    }
    /**
     * 根据id批量删除用户
     * @param
     * @return
     */
    @PostMapping("deletes")
    public int deleteUsersId(@RequestParam Integer[] userId){
        Integer data = userService.deleteUsersId (userId);
        return data;
    }

    /**
     * 根据修改性别
     * @param userId
     * @param sex
     * @return
     */
    @PostMapping("/updatesex")
    public int upUserSex(Integer userId, char sex){
        int userSex = userService.updateUserSex (userId,sex);
        return userSex;
    }
    //===========前台===========
    /**
     * 添加
     * @param
     * @return
     */
    @PostMapping("/insert")
    public int insetUser(User user){
        int data = userService.insertUser (user);
        return data;
    }

    /**
     * 登录验证
     * @param
     * @return
     */
    @PostMapping("/login")
    public  User loginUser(@RequestParam String userName,@RequestParam String userPass){
        User user = userService.login (userName,userPass);
        return user;
    }

    /**
     * 前台用户修改
     * @param user
     * @return
     */
    @PostMapping("/updateuser")
    public int upUser(User user){
        int userSex = userService.updateUser (user);
        return userSex;
    }
}

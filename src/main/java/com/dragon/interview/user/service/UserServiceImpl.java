package com.dragon.interview.user.service;


import com.dragon.interview.user.entity.User;
import com.dragon.interview.user.mapper.UserMapper;
import com.dragon.interview.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
    @Resource
    UserMapper userMapper;
    //添加用户
    @Override
    public int insertUser(User user) {
        String userName = user.getUserName ();
        User name = userMapper.getUserName (userName);
        if (name==null){
            int number = userMapper.insertUser (user);

            return number;
        }
        return 0;

    }

    @Override
    public User getUserName(String userName) {
        User name = getUserName (userName);
        return name;
    }

    //根据姓名进行查询

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
}

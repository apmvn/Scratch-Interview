package com.dragon.interview.user.mapper;

import com.dragon.interview.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xiaoyuan
 * @Date: 2022/10/19/23:21
 * @Description:
 */
@Mapper
public interface UserMapper {
    //===========后台==================

    //查询一条记录
    User getUserName(String userName);

    //查询所有记录
    List<User> getAllUser();

    // 通过数组实现批量删除
    int deleteUsersId(@Param("userIds") Integer[] userIds);

    //删除记录
    int deleteUserId(Integer userId);

    //修改记录
    int updateUserSex(Integer userId , char sex);

    //模糊查询
    List<User> getUserByLike(@Param("userName") String userName);

    //根据Id进行查
    //查询一条记录
    User getUserId(Integer userId);
    //===========前台==========

    //登录验证
    User login(String userName,String userPass);

    //注册
    int insertUser(User user);

    //用户修改信息
    int updateUser(User user);
}

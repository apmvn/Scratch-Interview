package com.dragon.interview.user.service;


import com.dragon.interview.user.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xiaoyuan
 * @Date: 2022/10/21/8:58
 * @Description:
 */
public interface UserService {

    //添加记录
    public int insertUser(User user);

    //查询姓名
    public User getUserName(String userName);

    //模糊查询
    public List<User> getUserByLike(String userName);

    //查询所有记录
    public List<User> getAllUser();

    // 通过数组实现批量删除
    public int deleteUsersId(@Param("userIds") Integer[] userIds);

    //删除记录
    public int deleteUserId(Integer userId);

    //修改记录
    public int updateUserSex(Integer userId , char sex);
}

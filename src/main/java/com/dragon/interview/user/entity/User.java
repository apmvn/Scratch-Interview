package com.dragon.interview.user.entity;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xiaoyuan
 * @Date: 2022/10/19/11:33
 * @Description:
 */
public class User {

    private Integer userId;

    private String userName;

    private String userImg;

    private char  sex;

    private String introduction;

    private char  userStatus;

    private String email;

    public User(Integer userId, String userName, String userImg, char sex, String introduction, char userStatus, String email) {
        this.userId = userId;
        this.userName = userName;
        this.userImg = userImg;
        this.sex = sex;
        this.introduction = introduction;
        this.userStatus = userStatus;
        this.email = email;
    }

    public User() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public char getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(char userStatus) {
        this.userStatus = userStatus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userImg='" + userImg + '\'' +
                ", sex=" + sex +
                ", introduction='" + introduction + '\'' +
                ", userStatus=" + userStatus +
                ", email='" + email + '\'' +
                '}';
    }
}

package com.dragon.interview.subject.entity;

/**
 * date:22-10-19
 * type:题目标签类
 */
public class Subject_TagEntity {

    //存储标签id
    private Integer tag_id;
    //存储标签名
    private String tag_name;

    public Integer getTag_id() {
        return tag_id;
    }

    public void setTag_id(Integer tag_id) {
        this.tag_id = tag_id;
    }

    public String getTag_name() {
        return tag_name;
    }

    public void setTag_name(String tag_name) {
        this.tag_name = tag_name;
    }
}

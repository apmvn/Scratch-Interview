package com.dragon.interview.subject.entity;

/**
 * date:22-10-19
 * type:题目类型实体类
 */
public class Subject_TypeEntity {

    //题目类型ID
    private Integer st_id;
    //题目类型分类名，按照语言分类
    private String st_name;

    public Integer getSt_id() {
        return st_id;
    }

    public void setSt_id(Integer st_id) {
        this.st_id = st_id;
    }

    public String getSt_name() {
        return st_name;
    }

    public void setSt_name(String st_name) {
        this.st_name = st_name;
    }
}

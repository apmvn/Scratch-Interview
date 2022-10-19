package com.dragon.interview.subject.entity;

/**
 * date:22-10-19
 * type:题目类型实体类
 */
public class SubjectTypeEntity {

    //题目类型ID
    private Integer stId;
    //题目类型分类名，按照语言分类
    private String stName;


    public SubjectTypeEntity() {
    }

    public SubjectTypeEntity(Integer stId, String stName) {
        this.stId = stId;
        this.stName = stName;
    }
}

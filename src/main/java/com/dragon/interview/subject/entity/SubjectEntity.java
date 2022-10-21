package com.dragon.interview.subject.entity;

import java.util.List;

/**
 * date:22-10-19
 * type:题目实体类
 */
public class SubjectEntity {

    //题目ID
    private Integer subjectId;
    //题目标题，存放题目
    private String subjectTitle;
    //题目类型，存储题目类型
    private Integer subjectTypeId;
    //答案id,存储答案id
    private Integer answerId;
    // 语言分类
    private Integer devLanguageId;

    public SubjectEntity(Integer subjectId, String subjectTitle, Integer subjectTypeId, Integer answerId, Integer devLanguageId) {
        this.subjectId = subjectId;
        this.subjectTitle = subjectTitle;
        this.subjectTypeId = subjectTypeId;
        this.answerId = answerId;
        this.devLanguageId = devLanguageId;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectTitle() {
        return subjectTitle;
    }

    public void setSubjectTitle(String subjectTitle) {
        this.subjectTitle = subjectTitle;
    }

    public Integer getSubjectTypeId() {
        return subjectTypeId;
    }

    public void setSubjectTypeId(Integer subjectTypeId) {
        this.subjectTypeId = subjectTypeId;
    }

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public Integer getDevLanguageId() {
        return devLanguageId;
    }

    public void setDevLanguageId(Integer devLanguageId) {
        this.devLanguageId = devLanguageId;
    }
}



package com.dragon.interview.subject.entity;

/**
 * date:22-10-19
 * type:题目表实体类
 */
public class SubjectEntity {

    //题目ID
    private Integer subjectId;
    //题目标题，存放题目
    private String subjectTitle;
    //题目类型，存储题目类型
    private String subjectTypeName;
    // 语言分类
    private String devLanguageId;

    public SubjectEntity(Integer subjectId, String subjectTitle, String subjectTypeName, String devLanguageId) {
        this.subjectId = subjectId;
        this.subjectTitle = subjectTitle;
        this.subjectTypeName = subjectTypeName;
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

    public String getSubjectTypeName() {
        return subjectTypeName;
    }

    public void setSubjectTypeName(String subjectTypeName) {
        this.subjectTypeName = subjectTypeName;
    }

    public String getDevLanguageId() {
        return devLanguageId;
    }

    public void setDevLanguageId(String devLanguageId) {
        this.devLanguageId = devLanguageId;
    }
}

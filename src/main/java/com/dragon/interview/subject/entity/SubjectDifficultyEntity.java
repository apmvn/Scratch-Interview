package com.dragon.interview.subject.entity;

/**
 * date:22-10-19
 * type:题目难度实体类
 */
public class SubjectDifficultyEntity {

    //题目困难ID
    private Integer difficultyId;
    //题目困难级别 分为三个级别 简单、容易、困难
    private String difficultyLevel ;

    public SubjectDifficultyEntity(){

    }

    public SubjectDifficultyEntity(Integer difficultyId, String difficultyLevel) {
        this.difficultyId = difficultyId;
        this.difficultyLevel = difficultyLevel;
    }

    public Integer getDifficultyId() {
        return difficultyId;
    }

    public void setDifficultyId(Integer difficultyId) {
        this.difficultyId = difficultyId;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
}

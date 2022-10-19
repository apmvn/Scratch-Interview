package com.dragon.interview.subject.entity;

/**
 * date:22-10-19
 * type:题目难度实体类
 */
public class Subject_DifficultyEntity {

    //题目困难ID
    private Integer difficulty_id;
    //题目困难级别 分为三个级别 简单、容易、困难
    private String difficulty_level ;

    public Integer getDifficulty_id() {
        return difficulty_id;
    }

    public void setDifficulty_id(Integer difficulty_id) {
        this.difficulty_id = difficulty_id;
    }

    public String getDifficulty_level() {
        return difficulty_level;
    }

    public void setDifficulty_level(String difficulty_level) {
        this.difficulty_level = difficulty_level;
    }
}

package com.dragon.interview.subject.entity;

import java.util.List;

/**
 * date:22-10-19
 * type:题目实体类
 */
public class SubjectEntity {

    //题目ID
    private Integer subject_id;
    //题目标题，存放题目
    private String subject_title;
    //题目类型，存储题目类型
    private List<Subject_TypeEntity> subject_type_id;
    //答案id,存储答案id
    private List<AnswerEntity> answer_id;
    //题目难度，存储题目难度ID
    private List<Subject_DifficultyEntity> difficulty;
    //题目热度，用于搜索推荐
    private Integer subject_heat;
    //题目收藏数
    private Integer favorites ;

    public Integer getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(Integer subject_id) {
        this.subject_id = subject_id;
    }

    public String getSubject_title() {
        return subject_title;
    }

    public void setSubject_title(String subject_title) {
        this.subject_title = subject_title;
    }

    public List<Subject_TypeEntity> getSubject_type_id() {
        return subject_type_id;
    }

    public void setSubject_type_id(List<Subject_TypeEntity> subject_type_id) {
        this.subject_type_id = subject_type_id;
    }

    public List<AnswerEntity> getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(List<AnswerEntity> answer_id) {
        this.answer_id = answer_id;
    }

    public List<Subject_DifficultyEntity> getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(List<Subject_DifficultyEntity> difficulty) {
        this.difficulty = difficulty;
    }

    public Integer getSubject_heat() {
        return subject_heat;
    }

    public void setSubject_heat(Integer subject_heat) {
        this.subject_heat = subject_heat;
    }

    public Integer getFavorites() {
        return favorites;
    }

    public void setFavorites(Integer favorites) {
        this.favorites = favorites;
    }
}

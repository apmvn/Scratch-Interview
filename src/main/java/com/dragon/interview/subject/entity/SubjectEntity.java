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
    private List<SubjectTypeEntity> subjectTypeId;
    //答案id,存储答案id
    private List<AnswerEntity> answerId;
    //题目难度，存储题目难度ID
    private List<SubjectDifficultyEntity> difficulty;
    //题目热度，用于搜索推荐
    private Integer subjectHeat;
    //题目收藏数
    private Integer favorites ;


    public SubjectEntity() {
    }

    public SubjectEntity(Integer subjectId, String subjectTitle, List<SubjectTypeEntity> subjectTypeId, List<AnswerEntity> answerId, List<SubjectDifficultyEntity> difficulty, Integer subjectHeat, Integer favorites) {
        this.subjectId = subjectId;
        this.subjectTitle = subjectTitle;
        this.subjectTypeId = subjectTypeId;
        this.answerId = answerId;
        this.difficulty = difficulty;
        this.subjectHeat = subjectHeat;
        this.favorites = favorites;
    }
}

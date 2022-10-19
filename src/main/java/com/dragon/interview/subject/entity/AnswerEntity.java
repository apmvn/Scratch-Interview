package com.dragon.interview.subject.entity;

/**
 * date:22-10-19
 * type:题目答案实体类
 */
public class AnswerEntity {

    //答案id
    private Integer answerId;
    //答案
    private String answer;


    public AnswerEntity() {
    }

    public AnswerEntity(Integer answerId, String answer) {
        this.answerId = answerId;
        this.answer = answer;
    }

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}

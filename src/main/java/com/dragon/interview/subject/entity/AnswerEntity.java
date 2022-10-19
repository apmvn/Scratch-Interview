package com.dragon.interview.subject.entity;

/**
 * date:22-10-19
 * type:题目答案实体类
 */
public class AnswerEntity {

    //答案id
    private Integer answer_id;
    //答案
    private String answer;

    public Integer getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(Integer answer_id) {
        this.answer_id = answer_id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}

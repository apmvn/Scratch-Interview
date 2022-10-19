package com.dragon.interview.commons;

public class Result<T> {
    //0表示操作失败，1表示操作成功
    private int code;
    private String msg;
    private T t;

    public Result(int code, String msg, T t) {
        this.code = code;
        this.msg = msg;
        this.t = t;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

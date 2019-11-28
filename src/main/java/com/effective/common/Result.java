package com.effective.common;

/**
 * @Description
 * @author:caiyuan
 * @date:2019/11/21 0021
 * @ver:1.0
 **/
public class Result<T> {

    private int code;

    private String msg;

    private long count;

    private T data;

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
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

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

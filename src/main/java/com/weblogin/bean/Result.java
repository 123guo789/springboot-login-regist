package com.weblogin.bean;

public class Result<T> {
    private String msg;
    private boolean success;
    private T detail;

    public boolean isSuccess() {
        return success;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setDetail(T detail) {
        this.detail = detail;
    }

    public String getMsg() {
        return msg;
    }

    public T getDetail() {
        return detail;
    }
}

package com.factory.config.entity;

/**
 * 接口响应类
 */
public class ResponseResult {
    private String errcode="";
    private String data = "";
    private String errmsg = "";

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public ResponseResult() {
    }

    public ResponseResult(String errcode, String data, String errmsg) {
        this.errcode = errcode;
        this.data = data;
        this.errmsg = errmsg;
    }

    @Override
    public String toString() {
        return "ResponseResult{" +
                "errcode='" + errcode + '\'' +
                ", data='" + data + '\'' +
                ", errmsg='" + errmsg + '\'' +
                '}';
    }
}

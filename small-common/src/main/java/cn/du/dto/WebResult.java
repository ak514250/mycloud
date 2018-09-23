package cn.du.dto;

import java.io.Serializable;

public class WebResult implements Serializable {

    private Integer status;

    private String msg;

    private Object data;

    public WebResult() {
    }

    public WebResult(Integer status) {
        this.status = status;
    }

    public WebResult(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public WebResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static WebResult success(){
        return new WebResult(200);
    }

    public static WebResult paramWrong(){
        return new WebResult(400,"参数错误");
    }

    public static WebResult systemWrong(){
        return new WebResult(500, "系统错误");
    }

    public static WebResult success(Object data){
        return new WebResult(200, "成功", data);
    }

}

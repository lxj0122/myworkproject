package com.material.utils;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/3/9
 * Time: 10:50
 */
public class Result<T> implements Serializable{
    private static final long serialVersionUID = 2147826905309298500L;
    //结果success 或 fail
    private String res;
    //错误信息描述
    private String desc;
    //返回的数据
    private T data;

    public Result(){

    }

    public Result(String res,String desc,T data){
        this.res=res;
        this.desc=desc;
        this.data=data;
    }
    public Result(String res,String desc){
        this.res=res;
        this.desc=desc;
    }
    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

package com.material.entity.user;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/3/8
 * Time: 15:38
 */
/*
注册实体
 */
public class Register implements Serializable {
    private static final long serialVersionUID = -5215887444279632220L;
    //用户名
    @NotNull
    private String name;
    //密码
    @NotNull
    private String pwd;
    //重复密码
    private String repeatPwd;
    //用户邮箱
    @NotNull
    private String mail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRepeatPwd() {
        return repeatPwd;
    }

    public void setRepeatPwd(String repeatPwd) {
        this.repeatPwd = repeatPwd;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}

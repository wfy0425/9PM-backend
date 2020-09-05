package com.professionalbugcoding.unicodesc.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import javax.validation.constraints.NotNull;


@TableName(value = "user")
public class UserBean {
    @NotNull
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @NotNull
    private String email;
    @NotNull
    private String password;
    private String name;
    private String myTeams;
    private String joinedTeams;
    @NotNull
    private Integer sex;
    private String roles;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMyTeams() {
        return myTeams;
    }

    public void setMyTeams(String myTeams) {
        this.myTeams = myTeams;
    }

    public String getJoinedTeams() {
        return joinedTeams;
    }

    public void setJoinedTeams(String joinedTeams) {
        this.joinedTeams = joinedTeams;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}

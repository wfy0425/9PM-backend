package com.professionalbugcoding.unicodesc.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value="user")
public class UserBean {
    @TableId(value="id",type= IdType.AUTO)
    private Integer id;

    private String name;
    private String invitation;
    private String username;
    private String password;
    private String roles;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInvitation(String invitation) {
        this.invitation = invitation;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getInvitation() {
        return invitation;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRoles() {
        return roles;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}

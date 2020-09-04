package com.professionalbugcoding.unicodesc.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.professionalbugcoding.unicodesc.bean.UserBean;
import com.professionalbugcoding.unicodesc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper = null;

    public UserBean getUser(String username) {
        return userMapper.selectOne(new QueryWrapper<UserBean>().eq("username",username));

    }

}

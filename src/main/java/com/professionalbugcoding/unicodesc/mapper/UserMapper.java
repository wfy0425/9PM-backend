package com.professionalbugcoding.unicodesc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.professionalbugcoding.unicodesc.bean.UserBean;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<UserBean> {
}
package com.professionalbugcoding.unicodesc.controller;

import com.professionalbugcoding.unicodesc.bean.ResponseBean;
import com.professionalbugcoding.unicodesc.bean.UserBean;
import com.professionalbugcoding.unicodesc.exception.UnauthorizedException;
import com.professionalbugcoding.unicodesc.service.UserService;
import com.professionalbugcoding.unicodesc.util.JWTUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Api(tags = "用户管理")
@RestController
@RequestMapping("/users")
public class UserController {

    private static final Logger LOGGER = LogManager.getLogger(UserController.class);

    //    @Autowired
    private UserService userService = null;

    @Autowired
    public void setService(UserService userService) {
        this.userService = userService;
    }

    @RequiresAuthentication
    @ApiOperation(value = "获取用户列表")
    @GetMapping()
    public ResponseBean getUserList() {
        List<UserBean> userBeans = userService.getUserList();
        return new ResponseBean(200, "OK", userBeans);
    }

    @RequiresAuthentication
    @ApiOperation(value = "通过用户id获取用户信息")
    @GetMapping("/{id}")
    public ResponseBean getUserInfoByUserId(@Valid @PathVariable int id) {
        UserBean userBean = userService.getUserInfoByUserId(id);
        return new ResponseBean(200, "OK", userBean);
    }

    @RequiresAuthentication
    @ApiOperation(value = "更新用户详细信息")
    @PutMapping("/{id}")
    public ResponseBean updateUser(@Valid @PathVariable int id,
                                   @RequestParam(value = "name", required = false) String name,
                                   @RequestParam(value = "password", required = false) String password,
                                   @RequestParam(value = "sex", defaultValue = "0") int sex) {

        //只能更新自己
        Subject subject = SecurityUtils.getSubject();
        if (!subject.isAuthenticated())
            throw new UnauthorizedException();
        String token = (String) subject.getPrincipal();
        String email = JWTUtil.getUsername(token);
        UserBean u = userService.getUserInfoByUserId(id);
        if (!email.equals(u.getEmail()))
            throw new UnauthorizedException();


        UserBean userBean = new UserBean();
        userBean.setName(name);
        userBean.setPassword(password);
        userBean.setSex(sex);
        int ans = userService.updateUserByUserId(id, userBean);
        return new ResponseBean(200, "OK", ans);
    }

    @RequiresAuthentication
    @ApiOperation(value = "从组队中删除用户")
    @DeleteMapping("/{teamId}.{userId}")
    public ResponseBean removeUserFromJoinedTeam(@Valid @PathVariable int teamId, @Valid @PathVariable int userId) {


        int ans = userService.removeUserFromJoinedTeam(teamId, userId);
        return new ResponseBean(200, "OK", ans);


    }

    @RequiresAuthentication
    @ApiOperation(value = "将用户加入队伍")
    @PutMapping("/{teamId}.{userId}")
    public ResponseBean joinTeam(@Valid @PathVariable int teamId, @Valid @PathVariable int userId) {


        int ans = userService.joinTeam(teamId, userId);
        return new ResponseBean(200, "OK", ans);


    }
}

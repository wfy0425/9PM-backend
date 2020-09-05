package com.professionalbugcoding.unicodesc.controller;

import com.professionalbugcoding.unicodesc.bean.ResponseBean;
import com.professionalbugcoding.unicodesc.bean.UserBean;
import com.professionalbugcoding.unicodesc.exception.CommonJsonException;
import com.professionalbugcoding.unicodesc.service.UserService;
import com.professionalbugcoding.unicodesc.util.JWTUtil;
import io.swagger.annotations.Api;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Api(tags = "鉴权")
@RestController
public class AuthController {

    private static final Logger LOGGER = LogManager.getLogger(AuthController.class);

    //    @Autowired
    private UserService userService = null;

    @Autowired
    public void setService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public ResponseBean login(@Valid @RequestParam("email") String email,
                              @Valid @RequestParam("password") String password) {

        UserBean userBean = userService.getUserInfoByUserEmail(email);
//        if(userBean.getUsername() == null||userBean.getPassword() == null)
//            throw new CommonJsonException(400l,"username or passowrd wrong");
//        System.out.println(userBean.getPassword().equals(password));
//        System.out.println(userBean.getPassword());
        System.out.println(password);
        if (userBean.getPassword().equals(password)) {
            return new ResponseBean(200, "Login success", JWTUtil.sign(email, password));
        } else {
            throw new CommonJsonException(400, "username or password wrong");
        }
    }

    @PostMapping("/register")
    public ResponseBean register(@Valid @RequestParam(value = "email", required = true) String email,
                                 @Valid @RequestParam(value = "password", required = true) String password,
                                 @Valid @RequestParam(value = "name") String name,
                                 @Valid @RequestParam(value = "sex", defaultValue = "0") int sex) {


//        try {
//            userService.getUserByEmail(email).getEmail();
//
//        }
//        catch (NullPointerException e){
//            new CommonJsonException(400l,"username or passowrd wrong");
//        }
        if (userService.getUserInfoByUserEmail(email) == null) {
            int ans = userService.addUser(email, password, name, null, null, sex);
//        if (userBean.getPassword().equals(password)) {
//            return new ResponseBean(200, "Login success", JWTUtil.sign(username, password));
//        } else {
//            throw new UnauthorizedException();
//        }
            return new ResponseBean(201, "user registered", JWTUtil.sign(email, password));
        } else
            throw new CommonJsonException(400, "username already exist");


    }


    @GetMapping("/require_auth")
    @RequiresAuthentication
    public ResponseBean requireAuth() {
        return new ResponseBean(200, "You are authenticated", null);
    }

    @GetMapping("/require_role")
    @RequiresRoles("admin")
    public ResponseBean requireRole() {
        return new ResponseBean(200, "You are visiting require_role", null);
    }

    @GetMapping("/require_permission")
    @RequiresPermissions(logical = Logical.AND, value = {"view", "edit"})
    public ResponseBean requirePermission() {
        return new ResponseBean(200, "You are visiting permission require edit,view", null);
    }

    @RequestMapping(path = "/401")
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ResponseBean unauthorized() {
        return new ResponseBean(401, "Unauthorized", null);
    }
}

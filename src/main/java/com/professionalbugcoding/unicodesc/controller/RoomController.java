package com.professionalbugcoding.unicodesc.controller;

import com.professionalbugcoding.unicodesc.bean.ResponseBean;
import com.professionalbugcoding.unicodesc.bean.RoomBean;
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

@Api(tags = "队伍管理")
@RestController
@RequestMapping("/rooms")
public class RoomController {

    private static final Logger LOGGER = LogManager.getLogger(RoomController.class);

//    @Autowired
    private UserService userService = null;

    @Autowired
    public void setService(UserService userService) {
        this.userService = userService;
    }
    @RequiresAuthentication
    @ApiOperation(value = "获取房间列表")
    @GetMapping()
    public ResponseBean getRoomList() {
        List<RoomBean> userBeans = userService.getRoomList();
        return new ResponseBean(200, "OK", userBeans);
    }

    @RequiresAuthentication
    @ApiOperation(value = "通过队伍id获取队伍信息")
    @GetMapping("/{id}")
    public ResponseBean getRoomInfoByRoomId(@Valid @PathVariable int id) {


        RoomBean roomBeansList = userService.getRoomInfoByRoomId(id);
        return new ResponseBean(200, "OK", roomBeansList);


    }

//    @GetMapping("/host/email/{email}")
//    public ResponseBean getRoomInfoByHostEmail(@PathVariable  String email) {
//
//
//        List<RoomBean> roomBeansList = userService.getRoomInfoByHostEmail(email);
//        return new ResponseBean(200, "OK", roomBeansList);
//
//
//    }

    @RequiresAuthentication
    @ApiOperation(value = "通过房主id获取队伍信息")
    @GetMapping("/host/{id}")
    public ResponseBean getRoomInfoByHostId(@Valid @PathVariable int id) {

        List<RoomBean> roomBeansList = userService.getRoomInfoByHostId(id);
        return new ResponseBean(200, "OK", roomBeansList);


    }

    @RequiresAuthentication
    @ApiOperation(value = "创建队伍")
    @PostMapping()
    public ResponseBean createRoom(@Valid @RequestParam("date") String date,
                                   @Valid @RequestParam("time") String time,
                                   @Valid @RequestParam("gameName") String gameName,
                                   @Valid @RequestParam("maxNumber") int maxNumber,
                                   @Valid @RequestParam("hostId") int hostId) {

        //只能创建以自己为房主的房间
        Subject subject = SecurityUtils.getSubject();
        if (!subject.isAuthenticated())
            throw new UnauthorizedException();
        String token = (String) subject.getPrincipal();
        String email = JWTUtil.getUsername(token);
        UserBean userBean = userService.getUserInfoByUserId(hostId);
        if (!email.equals(userBean.getEmail()))
            throw new UnauthorizedException();

        RoomBean ans = userService.createRoom(date, time, gameName, maxNumber, hostId);
        return new ResponseBean(201, "CREATED", ans);


    }

    @RequiresAuthentication
    @ApiOperation(value = "通过队伍id删除队伍")
    @DeleteMapping("/{id}")
    public ResponseBean deleteRoomByRoomId(@Valid @PathVariable int id) {


        //只能删除以自己为房主的房间
        Subject subject = SecurityUtils.getSubject();
        if (!subject.isAuthenticated())
            throw new UnauthorizedException();
        String token = (String) subject.getPrincipal();
        String email = JWTUtil.getUsername(token);
        RoomBean roomBean = userService.getRoomInfoByRoomId(id);
        UserBean userBean = userService.getUserInfoByUserId(roomBean.getHostId());
        if (!email.equals(userBean.getEmail()))
            throw new UnauthorizedException();

        int ans = userService.deleteRoomByRoomId(id);
        return new ResponseBean(200, "OK", ans);


    }
}

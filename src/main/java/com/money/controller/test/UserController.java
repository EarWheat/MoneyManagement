package com.money.controller.test;

import com.alibaba.fastjson.JSONObject;
import com.money.entity.User;
import com.money.service.test.UserService;
import com.money.util.JsonBuild;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/*
 * @author:liuzhaolu
 * @createTime: 2019-11-19 17:27
 * @desc:
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/getUserByUserName")
    public JSONObject getUserInfo(@RequestBody JSONObject param){
        if(!param.containsKey("userName")){
            return new JsonBuild().error("user not exist");
        }
        User user = userService.getUserInfoByUserName(param.getString("userName"));
        return new JsonBuild().success(user);
    }
}

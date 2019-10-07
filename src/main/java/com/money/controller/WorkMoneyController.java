package com.money.controller;

import com.alibaba.fastjson.JSONObject;
import com.money.util.JsonBuild;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @author:liuzhaolu
 * @createTime: 2019-09-30 14:58
 * @desc:
 */
@RestController
@RequestMapping("work")
public class WorkMoneyController {

    @GetMapping
    public JSONObject HelloWorld(){
        JSONObject hello = new JSONObject();
        hello.put("info","hello spring");
        return new JsonBuild().success(hello);
    }

    /**
     * @param param
     * @return JSON
     * @desc 获取工资详情
     */
    @RequestMapping("detail")
    public JSONObject getDetail(@RequestBody JSONObject param){
        if(!param.containsKey("userId")){
            return new JsonBuild().error("user not exist");
        }
        return new JsonBuild().success();
    }
}

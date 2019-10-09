package com.money.controller;

import com.alibaba.fastjson.JSONObject;
import com.money.util.JsonBuild;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @author:liuzhaolu
 * @createTime: 2019-10-09 17:04
 * @desc:梦幻西游利润计算
 */
@RestController
@RequestMapping("my")
public class MyMoneyController extends GameMoneyController {
    /**
     * 贩卖
     * @return
     */
    @RequestMapping
    public JSONObject SaleFlag(@RequestBody JSONObject param){
        System.out.println(param.get("time"));
        return new JsonBuild().success();
    }
}

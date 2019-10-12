package com.money.controller;

import com.alibaba.fastjson.JSONObject;
import com.money.dao.My.MyMoney;
import com.money.util.JsonBuild;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

    // 导标棋售价
    @Value("${flagSalePrice}")
    private int flagSalePrice;

    /**
     * 贩卖导标棋收入
     * @return
     */
    @RequestMapping("/saleFlag")
    public JSONObject SaleFlag(@RequestBody JSONObject param){

        return new JsonBuild().success(String.valueOf(flagSalePrice));
    }
}

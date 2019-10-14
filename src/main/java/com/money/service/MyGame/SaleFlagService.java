package com.money.service.MyGame;

import com.money.dao.My.FlagMoney;
import com.money.dao.My.MyMoney;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/*
 * @author:liuzhaolu
 * @createTime: 2019-10-14 11:42
 * @desc:
 */
@Service
public class SaleFlagService {

    @Resource
    private MyMoney myMoney;
    @Resource
    private FlagMoney flagMoney;

    // 计算利润
    public double getProfits(long makeMoney, int time){
        // 根据售价计算售出个数
        double num = makeMoney / flagMoney.getFlagSalePrice();
        // 计算棋子成本
        double flagCost = flagMoney.getFlagCostPrice() * num;
        // 计算点卡成本
        double timeCost = time * myMoney.getCostTime();
        // 总成本
        double totalCost = flagCost + timeCost;
        // 利润
        double profits = makeMoney - totalCost;
        return profits;
    }
}

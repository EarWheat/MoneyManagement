package com.money.dao.My;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

/*
 * @author:liuzhaolu
 * @createTime: 2019-10-12 16:43
 * @desc:
 */
@Repository
public class MyMoney {
    @Value("${cost}")
    private int cost;   // 点卡成本
    private float costTime; // 1min中成本价格
    private int costFifty; // 50点成本
    @Value("${costFiftyTime}")
    private int costFiftyTime; // 50点时长

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCostFifty() {
        costFifty = cost * 50;
        return costFifty;
    }

    public void setCostFifty(int costFifty) {
        this.costFifty = costFifty;
    }

    public int getCostFiftyTime() {
        return costFiftyTime;
    }

    public void setCostFiftyTime(int costFiftyTime) {
        this.costFiftyTime = costFiftyTime;
    }

    public float getCostTime() {
        costTime = this.getCostFifty() / costFiftyTime;
        return costTime;
    }

    public void setCostTime(float costTime) {
        this.costTime = costTime;
    }
}

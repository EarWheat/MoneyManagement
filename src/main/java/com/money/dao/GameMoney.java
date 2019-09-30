package com.money.dao;

/*
 * @author:liuzhaolu
 * @createTime: 2019-09-30 12:06
 * @desc:
 */
public class GameMoney extends BaseMoney {
    private long Buy;       // 购买支出
    private long Sale;      // 销售收入
    private long Cost;      // 成本

    public long getBuy() {
        return Buy;
    }

    public void setBuy(long buy) {
        Buy = buy;
    }

    public long getSale() {
        return Sale;
    }

    public void setSale(long sale) {
        Sale = sale;
    }

    public long getCost() {
        return Cost;
    }

    public void setCost(long cost) {
        Cost = cost;
    }
}

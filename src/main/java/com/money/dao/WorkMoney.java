package com.money.dao;

/*
 * @author:liuzhaolu
 * @createTime: 2019-09-30 12:03
 * @desc:工资收入
 */
public class WorkMoney extends BaseMoney {
    private long tax;        //  税收
    private long bonus;      //  奖金
    private long penalty;    //  罚金
    private String createTime;   // 时间

    public long getTax() {
        return tax;
    }

    public void setTax(long tax) {
        this.tax = tax;
    }

    public long getBonus() {
        return bonus;
    }

    public void setBonus(long bonus) {
        this.bonus = bonus;
    }

    public long getPenalty() {
        return penalty;
    }

    public void setPenalty(long penalty) {
        this.penalty = penalty;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}

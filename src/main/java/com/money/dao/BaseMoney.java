package com.money.dao;

/*
 * @author:liuzhaolu
 * @createTime: 2019-09-30 12:02
 * @desc:
 */
public class BaseMoney {
    private long InMoney;       // 收入
    private long OutMoney;      // 支出

    public long getInMoney() {
        return InMoney;
    }

    public void setInMoney(long inMoney) {
        InMoney = inMoney;
    }

    public long getOutMoney() {
        return OutMoney;
    }

    public void setOutMoney(long outMoney) {
        OutMoney = outMoney;
    }
}

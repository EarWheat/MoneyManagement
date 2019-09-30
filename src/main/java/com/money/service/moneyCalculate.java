package com.money.service;

import com.money.serviceImpl.moneyCalculateImpl;

/*
 * @author:liuzhaolu
 * @createTime: 2019-09-30 14:52
 * @desc:
 */
public class moneyCalculate implements moneyCalculateImpl {
    public int profit(int income,int cost){
        return income - cost;
    }
}

package com.money.dao.My;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

/*
 * @author:liuzhaolu
 * @createTime: 2019-10-14 14:47
 * @desc:
 */
@Repository
public class FlagMoney {
    @Value("${flagCostPrice}")
    private int flagCostPrice;
    @Value("${flagSalePrice}")
    private int flagSalePrice;

    public int getFlagCostPrice() {
        return flagCostPrice;
    }

    public void setFlagCostPrice(int flagCostPrice) {
        this.flagCostPrice = flagCostPrice;
    }

    public int getFlagSalePrice() {
        return flagSalePrice;
    }

    public void setFlagSalePrice(int flagSalePrice) {
        this.flagSalePrice = flagSalePrice;
    }
}

package com.money.controller;

import org.springframework.web.bind.annotation.GetMapping;
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
    public String HelloWorld(){
        return "hello spring";
    }
}

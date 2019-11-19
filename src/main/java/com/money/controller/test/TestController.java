package com.money.controller.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * @author:liuzhaolu
 * @createTime: 2019-10-22 18:40
 * @desc:
 */
@RestController
@RequestMapping("test")
public class TestController {
    public static void main(String[] args){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("district","01161");
        jsonObject.put("order_id","87965382447922");
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("district","01162");
        jsonObject1.put("order_id","87965382447933");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(jsonObject.toJSONString());
        arrayList.add(jsonObject1.toJSONString());
        System.out.println(arrayList.toString());
        System.out.println(getServiceOrderList(arrayList).toString());
    }

    public static ArrayList<String> getServiceOrderList(ArrayList<String> arrayList) {
        ArrayList<String> list = new ArrayList<>();
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            JSONObject jsonObject = JSON.parseObject(str);
            String orderId = jsonObject.getString("order_id");
            list.add(orderId);
        }
        return list;
    }


}

package com.money.util;

import com.alibaba.fastjson.JSONObject;

/*
 * @author:liuzhaolu
 * @createTime: 2019-10-07 16:33
 * @desc:Json辅助类
 */
public class JsonBuild {

    /**
     * JSON成功返回
     * @param json
     * @return
     */
    public JSONObject success(JSONObject json){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("errno",0);
        jsonObject.put("data",json);
        return jsonObject;
    }

    /**
     * JSON成功返回,无内容
     * @return
     */
    public JSONObject success(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("errno",0);
        jsonObject.put("errmsg","success");
        return jsonObject;
    }

    /**
     * JSON失败返回
     * @param errmsg
     * @return
     */
    public JSONObject error(String errmsg){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("errno",-1);
        jsonObject.put("errmsg",errmsg);
        return jsonObject;
    }

    /**
     * JSON参数错误返回
     * @return
     */
    public JSONObject paramError(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("errno",-1);
        jsonObject.put("errmsg","参数错误");
        return jsonObject;
    }
}

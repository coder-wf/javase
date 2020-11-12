package com.wyt.json;

import com.alibaba.fastjson.JSONArray;

public class TestJson {

    static String jsonStr = "{\"sites\":[{\"name\":\"蚂蚁课堂\",\"url\":\"www.itmayiedu.com\"},{\"name\":\"每特教育\",\"url\":\"http://meiteedu.com/\"}]}";

    static String jsonString = "[{\"name\":\"颜色\",\"value\":\"577584-01\"},{\"name\":\"服装尺码\",\"value\":\"XXS\"}]";



    public static void main(String[] args) {

        /*JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","魏峰");

        JSONArray jsonArray = new JSONArray();

        System.out.println(jsonObject);*/

        // 将json字符串转为jsonbject
        /*JSONObject jsonObject = new JSONObject();
        JSONObject jsonStrObject = jsonObject.parseObject(jsonStr);
        JSONArray jsonArray = jsonStrObject.getJSONArray("sites");
        for (Object object : jsonArray) {
            JSONObject stObject = (JSONObject) object;
            String name = stObject.getString("name");
            String url = stObject.getString("url");
            System.out.println(name + "---" + url);*/


        /*JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        JSONObject stObject = new JSONObject();
        stObject.put("name", "蚂蚁课堂");
        stObject.put("url", "http://www.itmayiedu.com");
        jsonArray.add(stObject);
        jsonObject.put("sites", jsonArray);
        System.out.println(jsonObject.toJSONString());*/


        JSONArray jsonArray = new JSONArray();





    }



}




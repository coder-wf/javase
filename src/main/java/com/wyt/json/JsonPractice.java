package com.wyt.json;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.math.BigDecimal;

public class JsonPractice {

    public static void main(String[] args) {
        String jsonStr = "{\"skuList\":[{\"price\":3312,\"priceType\":\"0\",\"skuId\":\"3624\"},{\"price\":4305.6,\"priceType\":\"3\",\"skuId\":\"3624\"}],\"productId\":\"2565\"}";

        //JSONObject jsonObject = new JSONObject();
        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        JSONArray jsonArray = jsonObject.getJSONArray("skuList");
        for (Object object : jsonArray) {
            JSONObject stObject = (JSONObject) object;
            BigDecimal price = stObject.getBigDecimal("price");
            stObject.put("price",new BigDecimal(String.format("%.2f",price.doubleValue())));

            //System.out.println(price.doubleValue());
        }

        System.out.println(jsonObject.toJSONString());



    }

    public static void m2(int a) {
        System.out.println(String.format("%.2f",Double.valueOf(a)));

    }

}

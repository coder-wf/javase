package com.wyt.map;

import java.util.HashMap;

public class TestMap {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("name","魏峰");
        map.put("age","26");

        System.out.println(map.get("name"));

    }

}

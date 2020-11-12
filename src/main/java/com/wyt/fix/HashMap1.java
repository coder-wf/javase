package com.wyt.fix;
   
import java.util.HashMap;
   
public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String,String> dictionary = new HashMap<>();
        dictionary.put("adc", "物理英雄");
        dictionary.put("apc", "魔法英雄");
        dictionary.put("t", "坦克");
        dictionary.put("wf", "爸爸");
         
        System.out.println(dictionary.get("wf"));
    }
}
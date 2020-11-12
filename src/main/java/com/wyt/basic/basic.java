package com.wyt.basic;

import org.apache.commons.lang3.StringUtils;

public class basic {

    static int i = 1000;

    //int i = 1000;

    public static void main(String[] args) {
        System.out.println("一共须支付$"+i);

        System.out.println(3*0.1 == 0.3);

        System.out.println(4*0.1 == 0.4);

        int a = -1;
        System.out.println(a);
        int b = 1;

        if(++a>0&&b-->0){
            System.out.println(a+"  "+b);
        }else{
            System.out.println(b+"  "+a);
        }
        StringUtils.isNotBlank(" ");
        StringUtils.isNotEmpty(" ");

        StringUtils.isEmpty("");
        StringUtils.isBlank("");

        System.out.println(StringUtils.isBlank(" "));
        System.out.println(StringUtils.isEmpty(" "));


        System.out.println(666);
    }



}

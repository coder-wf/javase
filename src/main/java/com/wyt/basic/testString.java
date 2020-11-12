package com.wyt.basic;

public class testString {
    //获取倒数第一，二，三个特定字符的位置
    public static void main(String[] args) {
        /*string mystring = "012.345.678.9";
		int i = mystring.LastIndexOf('.', (mystring.LastIndexOf(".") - 1));*/

        String s = "";

        String str = "_1108_";
        String str2 = "_1108_1109_";
        String str3 = "_1108_1109_1111_";

        int x = str3.lastIndexOf("_");
        int y = str3.lastIndexOf("_",x-1);
        int z = str3.lastIndexOf("_",y-1);

       // String str1 = str.substring(y+1,x);

        //String str21 = str2.substring(y+1,x);
        //String str22 = str2.substring(z+1,y);

        //String str31 = str3.substring(y+1,x);
        //String str32 = str3.substring(z+1,y);

        //System.out.println(str1);
        //System.out.println(str21);
        //System.out.println(str22);
        //System.out.println(str31);
        //System.out.println(str32);

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(s);
    }

}

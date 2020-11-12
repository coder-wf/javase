package com.wyt.fix;
public class MaxNum {
    public static void main(String[] args) {
        int values [] = new int[]{18,62,68,82,65,9};
 
        //数组中的内容是
        for (int each : values) {
            System.out.print(each+" ");
        }
        System.out.println();
        int max = -1;
        for (int each : values) {
            if(each>max)
                max = each;
        }
         
        System.out.println("最大的一个值是:"+max);
          
    }
}
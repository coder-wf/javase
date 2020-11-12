package com.wyt.fix;
public class Millionaire2 {
public static void main(String[] args) {
    double F = 0;
    for(int i = 1;i <= 999999999;i++) {
        F = 12000 * (Math.pow(1 + 0.2, i)) + F;
        System.out.println("经过" + i + "年，总收入为： " + F);
            if(F >= 1000000) {
                System.out.println("一共需要" + i + " 年");
                break;
                }   
        }
    }
}
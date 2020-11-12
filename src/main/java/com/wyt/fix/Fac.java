package com.wyt.fix;
import java.util.Scanner;
  
public class Fac {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = s.nextInt();
        int fac = 1;
        while(n>=1){
            fac *=n;
            n--;
        }
        System.out.println("阶乘是:" + fac);
    }
}
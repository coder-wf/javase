package com.wyt.fix;
import java.util.Scanner;
 
public class Season {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = s.nextInt();
        String season;
        switch (month) {
        case 1:
        case 2:
        case 3:
            season = "春天";
            break;
        case 4:
        case 5:
        case 6:
            season = "夏天";
            break;
        case 7:
        case 8:
        case 9:
            season = "秋天";
            break;
        case 10:
        case 11:
        case 12:
            season = "冬天";
            break;
        default:
            season = "这是什么鬼~";
 
        }
         
        System.out.println(season);
 
    }
}
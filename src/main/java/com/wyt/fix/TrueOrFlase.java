package com.wyt.fix;
public class TrueOrFlase {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
         
        System.out.println(a^b); //不同返回真
        System.out.println(a^!b); //相同返回假
       
        int i = 1;
        boolean c = !(i++ == 3) ^ (i++ ==2) && (i++==3);
        System.out.println(c);
        System.out.println(i);
        
    }
}
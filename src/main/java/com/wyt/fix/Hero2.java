package com.wyt.fix;
public class Hero2 {
    public String name;
    static String copyright;
    public static void main(String[] args) {
        Hero2 garden=new Hero2();
        garden.name = "盖伦";
         
        Hero2 teemo = new Hero2();
        teemo.name = "提莫";
         
        Hero2.copyright="版权由Riot Games公司所有";
        System.out.println(garden.copyright);
        garden.copyright = "Blizzard Entertainment Enterprise.";
        System.out.println(teemo.copyright);
                 
         
    }
 
 
}
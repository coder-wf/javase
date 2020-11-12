package com.wyt.fix;
 
import java.util.HashSet;
import java.util.Set;
 
public class HashSet3 {
    public static void main(String[] args) {
        Set<Integer> numbers =new HashSet<>();
        while(numbers.size()<50){
            int i = (int) (Math.random()*10000);
            numbers.add(i);
        }
        System.out.println("得到50个不重复随机数：");
        System.out.println(numbers);
    }
}
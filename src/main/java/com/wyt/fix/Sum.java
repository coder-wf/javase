package com.wyt.fix;
 
public class Sum {
    public static void main(String[]args) {
        int i=1;
        int sum=0;
        for( int j=1;j<=10;j++) {
             
            sum=sum+i;
            i=i*2;
             
        }
        System.out.println(sum);
    }
 
}
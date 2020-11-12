package com.wyt.speech;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class guessNumber{ 
	
	public static void main(String[] args) throws IOException{ 
		
		Random r=new Random(); 
		
		int num=r.nextInt(100); 
		
		System.out.println("请输入一个100以内的整数：");
		
		for (int i=0;i<=9;i++){ 
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 

			String str=br.readLine(); 
			
			int figure=Integer.parseInt(str); 
			
			if (figure>num){
				System.out.println("输入的数大了，输小点的！"); 
			}
			else if (figure<num){
				System.out.println("输入的数小了，输大点的！"); 
			}
			else { 
				System.out.println("恭喜你，猜对了！");
				
				if (i<=2){
					System.out.println("你真是个天才！"); 
				}
				else if (i<=5){
					System.out.println("哎哟不错噢！"); 
				}
				else if (i<=8){
					System.out.println("差点运气哦!"); 
				}
				else {
					System.out.println("哈哈哈哈哈哈!"); 
				}
				} 
} 
} 

}
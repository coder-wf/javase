package com.wyt.fix;

import java.util.Scanner;

/**
 * 
 * @author 26611
 *
 */

public class BMI {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入身高(m):");
		float a = s.nextFloat();
		System.out.println("身高:" + a);
		System.out.println("请输入体重(kg):");
		int b = s.nextInt();
		System.out.println("体重" + b);

		float c = b / (a * a);

		System.out.println("BMI:" + c);

	}
}
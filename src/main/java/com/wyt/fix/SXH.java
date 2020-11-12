package com.wyt.fix;
public class SXH {
	public static void main(String[] args) {

		for (int i = 100; i < 1000; i++) {

			int baiwei = i / 100;
			int shiwei = i / 10 % 10;
			int gewei = i % 10;
			int cube = baiwei * baiwei * baiwei + shiwei * shiwei * shiwei + gewei * gewei * gewei;
			if (cube == i) {
				System.out.println("找到水仙花数:" + i);
			}

		}

	}

}

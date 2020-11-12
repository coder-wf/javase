package com.wyt.fix;

public class Hero1 {

	String name; // 英雄名
	float hp; // 血量
	float armor; // 护甲
	int moveSpeed; // 移动速度
	
	

	void keng() {
		System.out.println("坑队友！");
	}

	void addSpeed(int speed) {
		// 在原来的基础上增加移动速度
		moveSpeed = moveSpeed + speed;
	}

	public static void main(String[] args) {
		Hero1 garen = new Hero1();
		garen.name = "盖伦";
		garen.hp = 616.28f;
		garen.armor = 27.536f;
		garen.moveSpeed = 350;

		Hero1 teemo = new Hero1();
		teemo.name = "提莫";
		teemo.hp = 383f;
		teemo.armor = 14f;
		teemo.moveSpeed = 330;

		garen.keng();
		garen.addSpeed(100);

		System.out.println(garen.moveSpeed);
		
		int i = 1 ;
		i+=++i;
		
		System.out.println(i);

	}

}

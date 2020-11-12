package com.wyt.thread2;

public class Hero1 {
	public String name;
	public float hp;

	public Hero1() {

	}

	public Hero1(String name) {
		this.name = name;
	}

	public int damage;

	public void attackHero(Hero h) {
		try {
			// 为了表示攻击需要时间，每次攻击暂停1000毫秒
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		h.hp -= damage;
		System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n", name, h.name, h.name, h.hp);

		if (h.isDead())
			System.out.println(h.name + "死了！");
	}

	public boolean isDead() {
		return 0 >= hp ? true : false;
	}

	int totalTime = 3;

	public void adugen() {
		while (true) {
			for (int i = 0; i < totalTime; i++) {
				System.out.printf("波动拳第%d发%n", i + 1);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			System.out.println("开始为时5秒的充能");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		Hero1 h = new Hero1();
		h.name = "红仔";

		h.adugen();

	}

}

package com.kgc.morning;

public class Classmate {
	String name = "赵跃";
	String sex = "男";
	int age = 21;
	int id = 2;

	public void code() {
		System.out.println("我同桌天天写bug。");
	}

	public static void main(String[] args) {
		Classmate classmate = new Classmate();
		classmate.code();
	}

}

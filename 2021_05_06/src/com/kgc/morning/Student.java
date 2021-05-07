package com.kgc.morning;

public class Student {
	String sex = "男";
	String name = "gg";
	int age = 40;
	int id = 1;

	public void study() {
		System.out.println("凌晨三点起来学习");
	}

	public static void main(String[] args) {
		Student stu1 = new Student();
		System.out.println(stu1);
		stu1.study();
	}

}

package com.kgc.morning;

public class Student {
	String sex = "��";
	String name = "gg";
	int age = 40;
	int id = 1;

	public void study() {
		System.out.println("�賿��������ѧϰ");
	}

	public static void main(String[] args) {
		Student stu1 = new Student();
		System.out.println(stu1);
		stu1.study();
	}

}

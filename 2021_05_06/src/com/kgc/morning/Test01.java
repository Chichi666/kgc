package com.kgc.morning;

public class Test01 {

	public static void main(String[] args) {
		Stu stu1 = new Stu();
		System.out.println(stu1.name);
		System.out.println("年龄：" + stu1.age);
		System.out.println("就读于：" + stu1.classes);
		System.out.println("爱好：" + stu1.hobby);
		System.out.println("");
		Teacher teacher1 = new Teacher();
		System.out.println(teacher1.name);
		System.out.println("专业方向：" + teacher1.direction);
		System.out.println("教授课程：" + teacher1.tproject);
		System.out.println("教龄：" + teacher1.tage);
	}

}

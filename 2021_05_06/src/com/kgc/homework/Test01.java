package com.kgc.homework;

public class Test01 {

	public static void main(String[] args) {
		Students stu1 = new Students();
		Teachers teac1 = new Teachers();
		Classes cla1 = new Classes();
		Project pro1 = new Project();
		SPT spt1 = new SPT();
		System.out.println(stu1.name + "在" + cla1.local + "上" + pro1.name + "课");
		System.out.println(pro1.name + "课的老师是" + teac1.name);
		System.out.println("成绩是：" + spt1.grade);
	}

}

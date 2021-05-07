package com.kgc.homework;

import java.util.Scanner;

public class TestSM {

	public static void main(String[] args) {
		// 键盘输入
		Scanner input = new Scanner(System.in);
		// 实例化studentmanage对象
		StudentManger stm = new StudentManger();
		// 循环输入5个姓名
		for (int i = 0; i < 5; i++) {
			System.out.println("输入姓名：");
			stm.names[i] = input.next();
		}
		System.out.println("====姓名展示====");
		// 调用姓名展示方法，无参
		stm.showNames();
		// 键盘接收开始结束位置及所要查找姓名
		System.out.println("输入查找开始位置：");
		int s = input.nextInt();
		System.out.println("输入查找结束位置：");
		int e = input.nextInt();
		System.out.println("输入查找姓名：");
		String inName = input.next();
		// 调用searchNames方法 ，判断是否找到区间内的姓名
		if (stm.searchNames(s, e, inName)) {
			System.out.println("找到了！");
		} else {
			System.out.println("未找到！");
		}

	}

}

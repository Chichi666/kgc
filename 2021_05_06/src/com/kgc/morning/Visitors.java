package com.kgc.morning;

import java.util.Scanner;

public class Visitors {
	String name;
	int age;

	public void price() {
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("请输入姓名：");
			name = input.next();
			if (name.equals("n")) {
				System.out.println("欢迎下次光临");
				break;
			}
			System.out.println("请输入年龄：");
			age = input.nextInt();
			if (age < 10 || age > 60) {
				System.out.println("不收费");
			} else {
				System.out.println("全票");
			}
		} while (true);
	}
}

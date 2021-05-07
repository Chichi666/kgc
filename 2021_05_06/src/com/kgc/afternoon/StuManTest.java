package com.kgc.afternoon;

import java.util.Scanner;

public class StuManTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StudentMnager stm = new StudentMnager();
		for (int i = 0; i < 5; i++) {
			System.out.println("请输入学生姓名：");
			String inName = input.next();
			stm.addName(inName);
		}
		stm.showNames();
		System.out.println("请输入要查找的区间：");
		int inS = input.nextInt();
		int inE = input.nextInt();
		stm.showNames();
		System.out.println("请输入要查找的姓名：");
		String inName = input.next();
		System.out.println("====查找结果====");
		if (stm.searchNames(inS, inE, inName)) {
			System.out.println("找到了！");
		} else {
			System.out.println("未找到！");
		}
	}

}

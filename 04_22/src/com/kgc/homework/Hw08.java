package com.kgc.homework;

import java.util.Scanner;

public class Hw08 {
	// 键盘输入10个数 统计 + - 0的个数
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;
		int num = 0;
		Scanner input = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			System.out.println("请输入第" + i + "个数");
			num = input.nextInt();
			if (num < 0) {
				a++;
			} else if (num == 0) {
				b++;
			} else {
				c++;
			}
		}
		System.out.println("含负数" + a + "个");
		System.out.println("含零" + b + "个");
		System.out.println("含正数" + c + "个");
	}

}

package com.kgc.homework;

import java.util.Scanner;

public class Hw05 {
	// 输入两个数 取大的数
	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System.in);
		System.out.println("输入第一个数");
		a = input.nextInt();
		System.out.println("输入第二个数");
		b = input.nextInt();
		if (a >= b) {
			System.out.println("较大值为" + a);
		} else {
			System.out.println("较大值为" + b);
		}
	}

}

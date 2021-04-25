//判断奇偶数

package com.kgc.homework;

import java.util.Scanner;

public class Hw02 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个数");
		num = input.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + "是偶数");
		} else {
			System.out.println(num + "是奇数");
		}

	}
}

package com.kgc.afternoon;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		int sum = 0;
		int[] num = { 8, 4, 2, 1, 23, 344, 12 };
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			sum += num[i];
		}
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个数字:");
		int gas = input.nextInt();
		for (int i = 0; i <= num.length; i++) {
			if (gas == num[i]) {
				System.out.println("包含此数");
				break;
			}
			System.out.println("不");
		}
	}

}

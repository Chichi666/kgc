package com.kgc.kt.afternoon;

import java.util.Scanner;

public class Test06 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个值");
		int temp = input.nextInt();
		System.out.println("根据这个值可以输出以下加法表");
		// for (int j = 0; j < temp; j++) {
		// System.out.println(j + "+" + i + "=" + (j + i));
		// i--;
		// }
		for (int i = 0, j = temp; i <= temp; i++, j--) {
			System.out.println(i + "+" + j + "=" + (i + j));
		}
	}
}

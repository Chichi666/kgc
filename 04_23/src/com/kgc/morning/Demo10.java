package com.kgc.morning;

import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n + 1 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * (n + 1 - i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}

package com.kgc.morning;

import java.util.Scanner;

public class Demo16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个行数：");
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int j = 1; j < i; j++) {
				System.out.print(i - j);
			}
			System.out.println(" ");
		}
	}

}

package com.kgc.morning;

import java.util.Scanner;

public class Demo13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char ch = 'A';
		System.out.println(ch);
		System.out.println("请输入一个行数：");
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (n + 1) - i; j++) {
				System.out.print(ch += (n - 1 - (j - 1) - (i - 1)));
			}
			for (int j = 1; j <= (n + 1) - i; j++) {
				System.out.print(ch += j);
			}
			System.out.println(" ");
		}
	}

}

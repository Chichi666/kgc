package com.kgc.morning;

import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个行数：");
		int n = input.nextInt();
		char ch = 'a';
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n + 1 - i; j++) {
				System.out.print(ch);
			}
			ch += 1;
			System.out.println(" ");
		}
	}

}

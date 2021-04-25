package com.kgc.morning;

import java.util.Scanner;

public class Demo12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个行数：");
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			char ch = 'a';
			for (int j = 1; j <= n + 1 - i; j++) {
				System.out.print(ch);
				ch += 1;
			}
			System.out.println(" ");
		}
	}

}

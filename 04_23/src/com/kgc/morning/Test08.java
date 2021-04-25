package com.kgc.morning;

public class Test08 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) { // 此三角形外部一共5列
			// 打印空格
			for (int j = 1; j <= 5 - i; j++) { // 利用i使j每次打印的次数减少1
				System.out.print(" ");
			}
			// 打印三角形
			for (int m = 1; m <= 2 * i - 1; m++) { // 利用i控制m使其每次打印增加1
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= 4; i++) { // 此三角形外部一共5列
			// 打印空格
			for (int j = 1; j <= 2 * i - 2; j++) { // 利用i使j每次打印的次数减少1
				System.out.print("*");
			}
			// 打印三角形
			for (int m = 1; m <= 2 * i - 1; m++) { // 利用i控制m使其每次打印增加1
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}

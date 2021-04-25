package com.kgc.homework;

import java.util.Scanner;

public class Hw04 {
	// 判断一个年份是闰年还是平年
	public static void main(String[] args) {
		System.out.println("输入一个年份");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "是闰年");
		} else {
			System.out.println(year + "是平年");
		}
	}

}

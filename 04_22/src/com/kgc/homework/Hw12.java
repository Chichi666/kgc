package com.kgc.homework;

import java.util.Scanner;

public class Hw12 {
	// 打印1~100所有整数和
	public static void main(String[] args) {
		int i = 0, sum = 0;
		System.out.println("输入一个小于100的值：");
		Scanner input = new Scanner(System.in);
		i = input.nextInt();
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println("输出从该值到100所有整数的和" + sum);
	}

}

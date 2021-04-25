package com.kgc.afternoon;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		System.out.println("请输入4家店的价格:");
		Scanner input = new Scanner(System.in);
		// int price = input.nextInt();
		int[] prices = new int[4];
		for (int i = 0; i < prices.length; i++) {
			prices[i] = input.nextInt();
		}
		int min = 0;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < min) {
				min = prices[i];
			}
		}
		System.out.println("最低价格是：" + min);
	}

}

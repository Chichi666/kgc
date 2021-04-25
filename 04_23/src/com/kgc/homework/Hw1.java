package com.kgc.homework;

import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {
		double[] total = new double[5];
		double sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入会员本月的消费记录");
		for (int i = 0; i < total.length; i++) {
			System.out.println("请输入第" + (i + 1) + "笔购物金额：");
			total[i] = input.nextDouble();
			sum += total[i];
		}
		System.out.println("序号 " + "			" + "金额（元）");
		for (int i = 0; i < total.length; i++) {
			System.out.println((i + 1) + "			" + total[i]);
		}
		System.out.println("总金额 " + "			" + sum);
	}

}

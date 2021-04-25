package com.kgc.kt.afternoon;

import java.util.Scanner;

public class Test05 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double sum = 0;
		Scanner input = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			System.out.println("请输入5门课程中第" + i + "门课成绩：");
			int score = input.nextInt();
			System.out.println("第" + i + "门课程的分数是：" + score);
			sum += score;
		}
		System.out.println("平均分是" + sum / 5 + "分");
	}

}

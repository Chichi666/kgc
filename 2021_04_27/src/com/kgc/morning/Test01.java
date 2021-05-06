package com.kgc.morning;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] scores = new int[5];
		for (int i = 0; i < scores.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个学生成绩");
			scores[i] = input.nextInt();
		}
		for (int i = 0; i < scores.length - 1; i++) {
			for (int j = 0; j < scores.length - i - 1; j++) {
				if (scores[j] < scores[j + 1]) {
					int temp = scores[j];
					scores[j] = scores[j + 1];
					scores[j + 1] = temp;
				}
			}
		}
		System.out.println("排序后的成绩为：");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + "	");
		}
		input.close();
	}

}

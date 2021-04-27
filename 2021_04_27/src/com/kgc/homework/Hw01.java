package com.kgc.homework;

import java.util.Scanner;

public class Hw01 {

	public static void main(String[] args) {
		int[] scores = new int[5];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < scores.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个学生成绩：");
			scores[i] = input.nextInt();
		}
		// bubble排序
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
			System.out.println(scores[i]);
		}
	}

}

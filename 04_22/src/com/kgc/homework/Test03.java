package com.kgc.homework;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		int score = 0;
		System.out.println("请输入考试成绩：");
		Scanner input = new Scanner(System.in);
		score = input.nextInt();
		if (score >= 80) {
			System.out.println("良好");
		} else if (score < 80 && score >= 60) {
			System.out.println("中等");
		} else if (score < 60) {
			System.out.println("差");
		}
	}

}

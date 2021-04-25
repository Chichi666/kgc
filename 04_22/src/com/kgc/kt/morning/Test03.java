package com.kgc.kt.morning;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		int score = 0;
		System.out.println("请输入成绩");
		Scanner input = new Scanner(System.in);
		score = input.nextInt();
		if (score >= 80) {
			System.out.println("良好");
		} else if (score < 80 && score >= 60) {
			System.out.println("中等");
		} else {
			System.out.println("差");
		}
	}

}

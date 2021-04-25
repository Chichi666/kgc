package com.kgc.homework;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入java成绩：");
		int score = input.nextInt();
		if (score > 90) {
			System.out.println("老师奖励iphone 12");
		} else {
			System.out.println("回家种田吧");
		}
	}

}

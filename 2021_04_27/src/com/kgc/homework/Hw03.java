package com.kgc.homework;

import java.util.Scanner;

public class Hw03 {

	public static void main(String[] args) {
		int[][] scores = new int[5][3];
		int[] total = new int[5];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < scores.length; i++) {
			System.out.println("******第" + (i + 1) + "个班级： ******");
			for (int j = 0; j < scores[i].length; j++) {
				System.out.println("**请输入" + (i + 1) + "班第" + (j + 1) + "个同学成绩： **");
				scores[i][j] = input.nextInt();
				total[i] += scores[i][j];
			}
			System.out.println("********************");
		}
		for (int i = 0; i < total.length; i++) {
			System.out.println("***第" + (i + 1) + "个班级的总成绩：" + total[i] + "***");
		}
	}

}

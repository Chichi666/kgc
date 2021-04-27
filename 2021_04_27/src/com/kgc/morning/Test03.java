package com.kgc.morning;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		int[][] array = new int[5][5];
		int[] total = new int[5];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("*****第" + (i + 1) + "个班级：*****");
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("请输入第" + (j + 1) + "个学生成绩：");
				array[i][j] = input.nextInt();
				total[i] += array[i][j];
			}
		}
		for (int i = 0; i < total.length; i++) {
			System.out.println("*****第" + (i + 1) + "个班级的总成绩为：" + total[i] + " *****");
		}
	}

}

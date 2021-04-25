package com.kgc.afternoon;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		int[] score = new int[6];
		int temp = 0;
		Scanner input = new Scanner(System.in);
		System.out.println(score[2]);
		System.out.println("ÊäÈëÁù¸öÊı×Ö£º");
		for (int i = 0; i < score.length; i++) {
			score[i] = input.nextInt();
		}
		for (int i = 0; i < score.length - 1; i++) {
			for (int j = 0; j < score.length - 1 - i; j++) {
				if (score[j] < score[j + 1]) {
					temp = score[j];
					score[j] = score[j + 1];
					score[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
	}

}

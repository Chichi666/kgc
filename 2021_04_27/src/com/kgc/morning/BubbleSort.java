package com.kgc.morning;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		int[] score = new int[6];
		int temp = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("�����������֣�");
		for (int i = 0; i < score.length; i++) {
			score[i] = input.nextInt();
		}
		for (int i = 0; i < score.length - 1; i++) { // �������
			for (int j = 0; j < score.length - 1 - i; j++) { // �ڲ����
				if (score[j] < score[j + 1]) { // ����
					temp = score[j];
					score[j] = score[j + 1];
					score[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		input.close();
	}

}

package com.kgc.homework;

import java.util.Scanner;

public class Hw01 {

	public static void main(String[] args) {
		int[] scores = new int[5];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < scores.length; i++) {
			System.out.println("�������" + (i + 1) + "��ѧ���ɼ���");
			scores[i] = input.nextInt();
		}
		// bubble����
		for (int i = 0; i < scores.length - 1; i++) {
			for (int j = 0; j < scores.length - i - 1; j++) {
				if (scores[j] < scores[j + 1]) {
					int temp = scores[j];
					scores[j] = scores[j + 1];
					scores[j + 1] = temp;
				}
			}
		}
		System.out.println("�����ĳɼ�Ϊ��");
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
	}

}

package com.kgc.homework;

import java.util.Scanner;

public class Hw03 {
	// �ж�ѧ���ȼ�A~D
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ѧ���ɼ���");
		int score = input.nextInt();
		if (score >= 90) {
			System.out.println("A");
		} else if (score < 90 && score >= 80) {
			System.out.println("B");
		} else if (score < 80 && score >= 60) {
			System.out.println("C");
		} else if (score < 60 && score >= 0) {
			System.out.println("D");
		}

	}

}

package com.kgc.kt.morning;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		int score = 0;
		System.out.println("������ɼ�");
		Scanner input = new Scanner(System.in);
		score = input.nextInt();
		if (score >= 80) {
			System.out.println("����");
		} else if (score < 80 && score >= 60) {
			System.out.println("�е�");
		} else {
			System.out.println("��");
		}
	}

}

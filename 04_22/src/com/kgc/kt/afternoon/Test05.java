package com.kgc.kt.afternoon;

import java.util.Scanner;

public class Test05 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double sum = 0;
		Scanner input = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			System.out.println("������5�ſγ��е�" + i + "�ſγɼ���");
			int score = input.nextInt();
			System.out.println("��" + i + "�ſγ̵ķ����ǣ�" + score);
			sum += score;
		}
		System.out.println("ƽ������" + sum / 5 + "��");
	}

}

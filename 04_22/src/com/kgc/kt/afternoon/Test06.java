package com.kgc.kt.afternoon;

import java.util.Scanner;

public class Test06 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ��ֵ");
		int temp = input.nextInt();
		System.out.println("�������ֵ����������¼ӷ���");
		// for (int j = 0; j < temp; j++) {
		// System.out.println(j + "+" + i + "=" + (j + i));
		// i--;
		// }
		for (int i = 0, j = temp; i <= temp; i++, j--) {
			System.out.println(i + "+" + j + "=" + (i + j));
		}
	}
}

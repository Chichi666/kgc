package com.kgc.homework;

import java.util.Scanner;

public class Hw08 {
	// ��������10���� ͳ�� + - 0�ĸ���
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;
		int num = 0;
		Scanner input = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			System.out.println("�������" + i + "����");
			num = input.nextInt();
			if (num < 0) {
				a++;
			} else if (num == 0) {
				b++;
			} else {
				c++;
			}
		}
		System.out.println("������" + a + "��");
		System.out.println("����" + b + "��");
		System.out.println("������" + c + "��");
	}

}

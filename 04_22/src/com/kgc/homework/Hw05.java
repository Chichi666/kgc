package com.kgc.homework;

import java.util.Scanner;

public class Hw05 {
	// ���������� ȡ�����
	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System.in);
		System.out.println("�����һ����");
		a = input.nextInt();
		System.out.println("����ڶ�����");
		b = input.nextInt();
		if (a >= b) {
			System.out.println("�ϴ�ֵΪ" + a);
		} else {
			System.out.println("�ϴ�ֵΪ" + b);
		}
	}

}

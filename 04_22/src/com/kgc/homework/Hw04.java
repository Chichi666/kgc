package com.kgc.homework;

import java.util.Scanner;

public class Hw04 {
	// �ж�һ����������껹��ƽ��
	public static void main(String[] args) {
		System.out.println("����һ�����");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "������");
		} else {
			System.out.println(year + "��ƽ��");
		}
	}

}

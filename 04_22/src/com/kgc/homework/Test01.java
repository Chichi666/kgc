package com.kgc.homework;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������java�ɼ���");
		int score = input.nextInt();
		if (score > 90) {
			System.out.println("��ʦ����iphone 12");
		} else {
			System.out.println("�ؼ������");
		}
	}

}

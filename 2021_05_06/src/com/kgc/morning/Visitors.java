package com.kgc.morning;

import java.util.Scanner;

public class Visitors {
	String name;
	int age;

	public void price() {
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("������������");
			name = input.next();
			if (name.equals("n")) {
				System.out.println("��ӭ�´ι���");
				break;
			}
			System.out.println("���������䣺");
			age = input.nextInt();
			if (age < 10 || age > 60) {
				System.out.println("���շ�");
			} else {
				System.out.println("ȫƱ");
			}
		} while (true);
	}
}

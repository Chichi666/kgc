package com.kgc.kt.morning;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		System.out.println("************�˶��Ὺʼ��************");
		System.out.println("������ɼ���");
		Scanner input = new Scanner(System.in);
		double time = input.nextDouble();
		if (time < 15) {
			System.out.println("�������!");
			System.out.println("�������Ա�");
			String sex = input.next();
			if (sex.equals("��")) {
				System.out.println("�������������");
			} else if (sex.equals("Ů")) {
				System.out.println("����Ů�������");
			} else {
				System.out.println("��������ȷ�Ա�");
			}
		} else {
			System.out.println("���ź������ٽ�����");
		}
	}

}

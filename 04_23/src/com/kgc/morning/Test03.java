package com.kgc.morning;

public class Test03 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) { // ���������ⲿһ��5��
			// ��ӡ�ո�
			for (int j = 1; j <= 5 - i; j++) { // ����iʹjÿ�δ�ӡ�Ĵ�������1
				System.out.print(" ");
			}
			// ��ӡ������
			for (int m = 1; m <= 2 * i - 1; m++) { // ����i����mʹ��ÿ�δ�ӡ����1
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

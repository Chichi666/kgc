package com.kgc.homework;

import java.util.Scanner;

public class TestSM {

	public static void main(String[] args) {
		// ��������
		Scanner input = new Scanner(System.in);
		// ʵ����studentmanage����
		StudentManger stm = new StudentManger();
		// ѭ������5������
		for (int i = 0; i < 5; i++) {
			System.out.println("����������");
			stm.names[i] = input.next();
		}
		System.out.println("====����չʾ====");
		// ��������չʾ�������޲�
		stm.showNames();
		// ���̽��տ�ʼ����λ�ü���Ҫ��������
		System.out.println("������ҿ�ʼλ�ã�");
		int s = input.nextInt();
		System.out.println("������ҽ���λ�ã�");
		int e = input.nextInt();
		System.out.println("�������������");
		String inName = input.next();
		// ����searchNames���� ���ж��Ƿ��ҵ������ڵ�����
		if (stm.searchNames(s, e, inName)) {
			System.out.println("�ҵ��ˣ�");
		} else {
			System.out.println("δ�ҵ���");
		}

	}

}

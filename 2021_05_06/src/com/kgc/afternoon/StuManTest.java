package com.kgc.afternoon;

import java.util.Scanner;

public class StuManTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StudentMnager stm = new StudentMnager();
		for (int i = 0; i < 5; i++) {
			System.out.println("������ѧ��������");
			String inName = input.next();
			stm.addName(inName);
		}
		stm.showNames();
		System.out.println("������Ҫ���ҵ����䣺");
		int inS = input.nextInt();
		int inE = input.nextInt();
		stm.showNames();
		System.out.println("������Ҫ���ҵ�������");
		String inName = input.next();
		System.out.println("====���ҽ��====");
		if (stm.searchNames(inS, inE, inName)) {
			System.out.println("�ҵ��ˣ�");
		} else {
			System.out.println("δ�ҵ���");
		}
	}

}

package com.kgc.homework;

import java.util.Scanner;

public class Test04 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double time = 0;
		System.out.println("**************�˶��ῪĻ����**************");
		System.out.println("������ɼ���");
		Scanner input = new Scanner(System.in);
		time = input.nextDouble();
		// �ж��Ƿ��ܽ������
		if (time < 15) {
			System.out.println("��ϲ�������,�������Ա�");
			String sex = input.next();
			if (sex.equals("��")) {
				System.out.println("���������������");
			} else if (sex.equals("Ů")) {
				System.out.println("����Ů���������");
			} else {
				System.out.println("��������ȷ���Ա�");
			}
		} else {
			System.out.println("�ٽ�����");
		}
	}

}

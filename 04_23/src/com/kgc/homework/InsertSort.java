package com.kgc.homework;

import java.util.Scanner;

public class InsertSort {

	public static void main(String[] args) {
		int[] list = new int[6];// ����һ������Ϊ6������
		// ��ǰ�����ֵ
		list[0] = 99;
		list[1] = 85;
		list[2] = 82;
		list[3] = 63;
		list[4] = 60;
		System.out.println("�����������ɼ���");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		// ����һ����������λ�õ��±����index
		int index = 0;
		for (int i = 0; i < list.length; i++) {
			// �ж���������Ƿ���������е���
			if (num > list[i]) {
				// ��ǰ�������ڵ��±긳ֵ�����������±�
				index = i;
				break;
			}
		}
		// ������Ԫ�غ���
		for (int i = list.length - 1; i > index; i--) {
			// �����һ�����ݿ�ʼ����
			list[i] = list[i - 1];
		}
		// ��������
		list[index] = num;
		System.out.println("����ɼ����±��ǣ�" + index);
		System.out.println("�����ĳɼ���Ϣ�ǣ�");
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i] + "\t");
		}
		// for (int i : list) {
		// System.out.println(i);
		// }
	}

}

package com.kgc.afternoon;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// ������һ������Ϊ6������
		int[] list = new int[6];
		// �������ǰ5��λ�ý��и�ֵ
		list[0] = 99;
		list[1] = 85;
		list[2] = 82;
		list[3] = 63;
		list[4] = 60;
		// ���������ɼ�����λ��
		int index = list.length;
		System.out.println("�����������ɼ�:");
		// �������ĳɼ�
		Scanner input = new Scanner(System.in);
		// �Ӽ��̽��ճɼ�
		int num = input.nextInt();
		// ��������
		for (int i = 0; i < list.length; i++) {
			// �ж�,������������>�����е��κ�һ��Ԫ��
			if (num > list[i]) {
				// ������±긳ֵ���������ݵ��±�
				index = i; // ���ܳ��ֵ�ֵ��:1,2,3,4,5
				// ����ѭ��
				break;
			}
		}
		// Ԫ�غ��� ����������һ���ռ�
		for (int j = list.length - 1; j > index; j--) {
			// index�±꿪ʼ��Ԫ�غ���һ��λ��
			list[j] = list[j - 1];
		}
		// ������������������
		list[index] = num;
		// �����������±�
		System.out.println("����ɼ����±���:" + index);
		// ��ʾ��������Ϣ
		System.out.println("�����ĳɼ���Ϣ��:");
		// ��������
		for (int k = 0; k < list.length; k++) {
			System.out.println(list[k] + "\t");
		}
		// for (int i : list) {
		// System.out.println(i);
		// }
	}

}

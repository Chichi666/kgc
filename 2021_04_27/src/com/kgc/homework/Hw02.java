package com.kgc.homework;

import java.util.Arrays;

public class Hw02 {

	public static void main(String[] args) {
		int[] a1 = { 5, 3, 2, 1, 4 };
		int[] a2 = { 55, 99, 11, 22, 88 };

		// equal����
		boolean eq = Arrays.equals(a1, a2);
		System.out.println(eq);

		// ��array���� ����
		Arrays.sort(a1);
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}

		// ��arrayת��Ϊһ���ַ���
		String str = Arrays.toString(a2);
		System.out.println(str);

		// ��array���鸳ֵΪval
		// Arrays.fill(a1, 88);
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}

		// �����鸴�Ƴ�һ������Ϊlength��������
		// �������鳤����0��
		int[] a3 = Arrays.copyOf(a1, 8);
		for (int i = 0; i < a3.length; i++) {
			System.out.print(a3[i] + " ");
		}
		System.out.println("");
		// ��ѯ�����±�
		int bs = Arrays.binarySearch(a1, 3);
		System.out.println(bs);
	}

}

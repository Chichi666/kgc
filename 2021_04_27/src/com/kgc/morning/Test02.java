package com.kgc.morning;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		int[] scores = { 90, 70, 85, 88, 99 };
		int[] scores1 = { 90, 70, 85, 88, 90 };
		Arrays.sort(scores);
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}

		boolean a = Arrays.equals(scores, scores1);
		System.out.println(a);

		String b = Arrays.toString(scores1);
		System.out.println(b);

		Arrays.fill(scores1, 0);
		System.out.println(scores1);

		int[] copyOf = Arrays.copyOf(scores, 10);
		System.out.println(copyOf);

		/*
		 * �������ֵ���������е�Ԫ�� 1.������������ڵ�Ԫ�أ�����ֵΪ-��length+1); 2.���С��������Ԫ�أ�����ֵΪ-1;
		 * 3.��������֮�䡣��1��ʼ���㣬����ֵΪ-(�����λ�ã�
		 */
		int index = Arrays.binarySearch(scores, 90);
		System.out.println(index);
	}

}

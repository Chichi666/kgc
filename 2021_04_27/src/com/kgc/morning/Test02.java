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
		 * 如果搜索值不是数组中的元素 1.如果大于数组内的元素，索引值为-（length+1); 2.如果小于数组内元素，索引值为-1;
		 * 3.介于两者之间。从1开始计算，索引值为-(插入点位置）
		 */
		int index = Arrays.binarySearch(scores, 90);
		System.out.println(index);
	}

}

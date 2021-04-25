package com.kgc.afternoon;

public class Test03 {

	public static void main(String[] args) {
		int max = -1;
		int[] scores = { 95, 80, 90, 80, 98 };
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > max) {
				max = scores[i];
			}
		}
		System.out.println("最大值为：" + max);
	}

}

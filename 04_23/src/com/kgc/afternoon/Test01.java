package com.kgc.afternoon;

public class Test01 {

	public static void main(String[] args) {
		double sum = 0;
		int[] scores = { 100, 100, 100, 100, 0 };
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("平均分为" + sum / 5);
	}

}

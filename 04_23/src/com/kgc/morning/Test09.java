package com.kgc.morning;

public class Test09 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			if (sum > 20) {
				break;
			}
		}
		System.out.println(sum);
	}
}

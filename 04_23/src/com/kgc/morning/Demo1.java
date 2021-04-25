package com.kgc.morning;

public class Demo1 {

	public static void main(String[] args) {
		double x = 0.01;
		int i;
		for (i = 1;; i++) {
			x *= 2;
			if (x > 8848) {
				break;
			}
		}
		System.out.println(i);
	}

}

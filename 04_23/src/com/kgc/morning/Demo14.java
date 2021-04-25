package com.kgc.morning;

public class Demo14 {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 0; j <= i - 1; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4 - i; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}

}

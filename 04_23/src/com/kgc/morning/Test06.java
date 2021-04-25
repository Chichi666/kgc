package com.kgc.morning;

public class Test06 {

	public static void main(String[] args) {
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8 - i; j++) {
				System.out.print(" ");
			}
			for (int j2 = 1; j2 <= i; j2++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j2 = 1; j2 <= 8 - i; j2++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}

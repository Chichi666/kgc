//�ж���ż��

package com.kgc.homework;

import java.util.Scanner;

public class Hw02 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("������һ����");
		num = input.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + "��ż��");
		} else {
			System.out.println(num + "������");
		}

	}
}

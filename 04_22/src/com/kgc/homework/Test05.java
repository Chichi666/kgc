package com.kgc.homework;

import java.util.Scanner;

public class Test05 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("*************�����������ݣ�*************");
		System.out.println("������Ҫȥ��¥�㣺");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		switch (num) {
		case 1:
			System.out.println("��һ¥��");
			break;
		case 2:
			System.out.println("����¥��");
			break;
		case 3:
			System.out.println("����¥��");
			break;
		case 4:
			System.out.println("����¥��");
			break;
		case 5:
			System.out.println("����¥��");
			break;
		case 6:
			System.out.println("����¥��");
			break;
		default:
			System.out.println("û��Ŀ��¥��");
			break;
		}
	}

}

package com.kgc.homework;

import java.util.Scanner;

public class Hw07 {

	public static void main(String[] args) {
		int month = 0;
		System.out.println("������һ���·ݣ� (1~12)");
		Scanner input = new Scanner(System.in);
		month = input.nextInt();
		switch (month) {
		case 1:
			System.out.println(month + "���Ǵ���");
			break;
		case 2:
			System.out.println(month + "����ƽ��");
			break;
		case 3:
			System.out.println(month + "���Ǵ���");
			break;
		case 4:
			System.out.println(month + "����С��");
			break;
		case 5:
			System.out.println(month + "���Ǵ���");
			break;
		case 6:
			System.out.println(month + "����С��");
			break;
		case 7:
			System.out.println(month + "���Ǵ���");
			break;
		case 8:
			System.out.println(month + "���Ǵ���");
			break;
		case 9:
			System.out.println(month + "����С��");
			break;
		case 10:
			System.out.println(month + "���Ǵ���");
			break;
		case 11:
			System.out.println(month + "����С��");
			break;
		case 12:
			System.out.println(month + "���Ǵ���");
			break;
		default:
			break;
		}
	}

}

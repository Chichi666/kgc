package com.kgc.homework;

import java.util.Scanner;

public class Hw07 {

	public static void main(String[] args) {
		int month = 0;
		System.out.println("请输入一个月份： (1~12)");
		Scanner input = new Scanner(System.in);
		month = input.nextInt();
		switch (month) {
		case 1:
			System.out.println(month + "月是大月");
			break;
		case 2:
			System.out.println(month + "月是平月");
			break;
		case 3:
			System.out.println(month + "月是大月");
			break;
		case 4:
			System.out.println(month + "月是小月");
			break;
		case 5:
			System.out.println(month + "月是大月");
			break;
		case 6:
			System.out.println(month + "月是小月");
			break;
		case 7:
			System.out.println(month + "月是大月");
			break;
		case 8:
			System.out.println(month + "月是大月");
			break;
		case 9:
			System.out.println(month + "月是小月");
			break;
		case 10:
			System.out.println(month + "月是大月");
			break;
		case 11:
			System.out.println(month + "月是小月");
			break;
		case 12:
			System.out.println(month + "月是大月");
			break;
		default:
			break;
		}
	}

}

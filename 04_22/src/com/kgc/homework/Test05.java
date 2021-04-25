package com.kgc.homework;

import java.util.Scanner;

public class Test05 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("*************欢饮乘坐电梯！*************");
		System.out.println("输入你要去的楼层：");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		switch (num) {
		case 1:
			System.out.println("到一楼了");
			break;
		case 2:
			System.out.println("到二楼了");
			break;
		case 3:
			System.out.println("到三楼了");
			break;
		case 4:
			System.out.println("到四楼了");
			break;
		case 5:
			System.out.println("到五楼了");
			break;
		case 6:
			System.out.println("到六楼了");
			break;
		default:
			System.out.println("没有目标楼层");
			break;
		}
	}

}

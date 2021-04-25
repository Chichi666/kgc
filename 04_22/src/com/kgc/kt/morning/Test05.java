package com.kgc.kt.morning;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		System.out.println("请输入4位会员号：");
		Scanner input = new Scanner(System.in);
		int id = input.nextInt();
		int random = (int) (Math.random() * 10);
		System.out.println("随机数为：" + random);
		int bw = id / 100 % 10;
		if (bw == random) {
			System.out.println(id + "号客户是幸运客户，获得MP3一个");
		} else {
			System.out.println(id + "号客户，谢谢您的支持");
		}
	}

}

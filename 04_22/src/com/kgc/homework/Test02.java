package com.kgc.homework;

import java.util.Scanner;

public class Test02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int javas = 0;
		int musics = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入java成绩：");
		javas = input.nextInt();
		System.out.println("请输入音乐成绩：");
		musics = input.nextInt();
		if ((javas > 90 && musics > 80) || (javas == 100 && musics > 70)) {
			System.out.println("获得老师奖励");
		} else {
			System.out.println("回家种田吧");
		}
	}

}

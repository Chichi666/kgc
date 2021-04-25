package com.kgc.homework;

import java.util.Scanner;

public class Test04 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double time = 0;
		System.out.println("**************运动会开幕啦！**************");
		System.out.println("请输入成绩：");
		Scanner input = new Scanner(System.in);
		time = input.nextDouble();
		// 判断是否能进入决赛
		if (time < 15) {
			System.out.println("恭喜进入决赛,请输入性别：");
			String sex = input.next();
			if (sex.equals("男")) {
				System.out.println("进入男子组决赛！");
			} else if (sex.equals("女")) {
				System.out.println("进入女子组决赛！");
			} else {
				System.out.println("请输入正确的性别！");
			}
		} else {
			System.out.println("再接再厉");
		}
	}

}

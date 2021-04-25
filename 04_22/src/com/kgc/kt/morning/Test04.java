package com.kgc.kt.morning;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		System.out.println("************运动会开始了************");
		System.out.println("请输入成绩：");
		Scanner input = new Scanner(System.in);
		double time = input.nextDouble();
		if (time < 15) {
			System.out.println("进入决赛!");
			System.out.println("请输入性别：");
			String sex = input.next();
			if (sex.equals("男")) {
				System.out.println("进入男子组决赛");
			} else if (sex.equals("女")) {
				System.out.println("进入女子组决赛");
			} else {
				System.out.println("请输入正确性别");
			}
		} else {
			System.out.println("很遗憾，请再接再厉");
		}
	}

}

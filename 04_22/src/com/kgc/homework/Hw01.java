package com.kgc.homework;

import java.util.Scanner;

public class Hw01 {

	public static void main(String[] args) {
		String mc;
		System.out.println("请输入名次：");
		Scanner input = new Scanner(System.in);
		mc = input.next();
		switch (mc) {
		case "第一名":
			System.out.println(mc + "，参加麻省理工大学组织的一个月夏令营");
			break;
		case "第二名":
			System.out.println(mc + "，奖励惠普笔记本电脑一部");
			break;
		case "第三名":
			System.out.println(mc + "，奖励移动硬盘一个");
			break;
		default:
			System.out.println(mc + ",没有奖励");
			break;
		}
	}

}

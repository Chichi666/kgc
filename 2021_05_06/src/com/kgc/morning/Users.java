package com.kgc.morning;

import java.util.Scanner;

public class Users {
	String username = "admin";
	int pwd = 111111;

	public void login() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入用户名:");
		String inusername = input.next();
		System.out.println("请输入密码：");
		int inpwd = input.nextInt();
		if (inusername.equals(username) && inpwd == pwd) {
			System.out.println("请输入新密码：");
			pwd = input.nextInt();
			System.out.println("修改密码成，您的新密码为：" + pwd);
		} else {
			System.out.println("用户名和密码不匹配！您没有权限更新管理员信息");
		}
	}
}

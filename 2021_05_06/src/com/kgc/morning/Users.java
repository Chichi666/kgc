package com.kgc.morning;

import java.util.Scanner;

public class Users {
	String username = "admin";
	int pwd = 111111;

	public void login() {
		Scanner input = new Scanner(System.in);
		System.out.println("�������û���:");
		String inusername = input.next();
		System.out.println("���������룺");
		int inpwd = input.nextInt();
		if (inusername.equals(username) && inpwd == pwd) {
			System.out.println("�����������룺");
			pwd = input.nextInt();
			System.out.println("�޸�����ɣ�����������Ϊ��" + pwd);
		} else {
			System.out.println("�û��������벻ƥ�䣡��û��Ȩ�޸��¹���Ա��Ϣ");
		}
	}
}

package com.kgc.homework;

import java.util.Scanner;

public class Hw01 {

	public static void main(String[] args) {
		String mc;
		System.out.println("���������Σ�");
		Scanner input = new Scanner(System.in);
		mc = input.next();
		switch (mc) {
		case "��һ��":
			System.out.println(mc + "���μ���ʡ����ѧ��֯��һ��������Ӫ");
			break;
		case "�ڶ���":
			System.out.println(mc + "���������ձʼǱ�����һ��");
			break;
		case "������":
			System.out.println(mc + "�������ƶ�Ӳ��һ��");
			break;
		default:
			System.out.println(mc + ",û�н���");
			break;
		}
	}

}

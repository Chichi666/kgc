package com.kgc.kt.morning;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		System.out.println("������4λ��Ա�ţ�");
		Scanner input = new Scanner(System.in);
		int id = input.nextInt();
		int random = (int) (Math.random() * 10);
		System.out.println("�����Ϊ��" + random);
		int bw = id / 100 % 10;
		if (bw == random) {
			System.out.println(id + "�ſͻ������˿ͻ������MP3һ��");
		} else {
			System.out.println(id + "�ſͻ���лл����֧��");
		}
	}

}

package com.kgc.homework;

import java.util.Scanner;

public class Test02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int javas = 0;
		int musics = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("������java�ɼ���");
		javas = input.nextInt();
		System.out.println("���������ֳɼ���");
		musics = input.nextInt();
		if ((javas > 90 && musics > 80) || (javas == 100 && musics > 70)) {
			System.out.println("�����ʦ����");
		} else {
			System.out.println("�ؼ������");
		}
	}

}

package com.kgc.kt.afternoon;

import java.util.Scanner;

public class Demo02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// while (true) {
		// System.out.println("�����Ķ��̲ģ�ѧϰ���۲���");
		// System.out.println("�Ƿ���ɣ�Y/N");
		// String flag1 = input.next();
		// if (flag1.equals("Y")) {
		// System.out.println("�����ϻ���̣����մ��벿��");
		// System.out.println("�Ƿ���ɣ�Y/N");
		// String flag2 = input.next();
		// if (flag2.equals("Y")) {
		// System.out.println("�����ҵ���ϸ�");
		// break;
		// }
		// }
		// }

		do {
			System.out.println("�����Ķ��̲ģ�ѧϰ���۲���");
			System.out.println("�Ƿ���ɣ�Y/N");
			String flag1 = input.next();
			if (flag1.equals("Y")) {
				System.out.println("�����ϻ���̣����մ��벿��");
				System.out.println("�Ƿ���ɣ�Y/N");
				String flag2 = input.next();
				if (flag2.equals("Y")) {
					System.out.println("�����ҵ���ϸ�");
					break;
				}
			}
		} while (true);
	}
}
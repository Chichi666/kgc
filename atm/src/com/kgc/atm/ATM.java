package com.kgc.atm;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		int orpwd = 123456; // ��ʼ����
		int deposit = 800; // ��ʼ���
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("���������룺");
			int inpwd = input.nextInt();
			if (inpwd == orpwd) {
				break;
			} else {
				System.out.println("����������󣬻���" + (2 - i) + "�λ���");
				continue;
			}
		}
		int num = -1; // ���ܱ��
		do {
			System.out.println("====ATM������ϵͳ====");
			System.out.println("1��ȡ��");
			System.out.println("2�����");
			System.out.println("3����ѯ");
			System.out.println("4��ת��");
			System.out.println("0���˳�");
			int choose = input.nextInt();
			switch (choose) {
			case 1:
				System.out.println("====ȡ��ѡ��====");
				System.out.println("1��100");
				System.out.println("2��200");
				System.out.println("3��500");
				System.out.println("4��1000");
				System.out.println("������Ҫȡ��ı�ţ�");
				int qknum = input.nextInt();
				switch (qknum) {
				case 1:
					if (deposit >= 100) {
						deposit -= 100;
						System.out.println("��ȡ100Ԫ");
					} else {
						System.out.println("���㣡");
					}
					break;
				case 2:
					if (deposit >= 200) {
						deposit -= 200;
						System.out.println("��ȡ200Ԫ");
					} else {
						System.out.println("���㣡");
					}
					break;
				case 3:
					if (deposit >= 500) {
						deposit -= 500;
						System.out.println("��ȡ500Ԫ");
					} else {
						System.out.println("���㣡");
					}
					break;
				case 4:
					if (deposit >= 1000) {
						deposit -= 1000;
						System.out.println("��ȡ1000Ԫ");
					} else {
						System.out.println("���㣡");
					}
					break;
				default:
					System.out.println("�����������������");
					break;
				}
				break;
			case 2:
				System.out.println("====���====");
				System.out.println("�������");
				int indeposit = input.nextInt();
				System.out.println("ȷ�ϴ���" + indeposit + "Ԫ�𣿣�y/n��");
				String judge = input.next();
				if (judge.equals("y")) {
					deposit += indeposit;
					System.out.println("�Ѵ���" + indeposit + "Ԫ");
				} else {
					break;
				}
				break;
			case 3:
				System.out.println("====��ѯ���====");
				System.out.println("�˻����Ϊ��" + deposit);
				break;
			case 4:
				System.out.println("====ת��====");
				System.out.println("����Ҫת�˵Ľ��:");
				int transfer = input.nextInt();
				if (transfer > deposit) {
					System.out.println("���㣬ת��ʧ��");
				} else {
					deposit -= transfer;
					System.out.println("��ת��" + transfer + "Ԫ");
				}
				break;
			case 0:
				// System.out.println("���˳������պ�������п�");
				break;
			default:
				break;
			}
			if (choose <= 0 || choose > 4) {
				break;
			}
			// ��ʾ����0����
			System.out.println("����0���أ�");
			num = input.nextInt();
		} while (num == 0);
		{
			System.out.println("���˳������պ�������п�");
		}
	}

}

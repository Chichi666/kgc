package com.kgc.eat;

import java.util.Scanner;

public class Eatm {
	public static void main(String[] args) {
		// �������壻һ�鶩����Ϣ
		String[] names = new String[4]; // ������
		String[] dishMegs = new String[4]; // ������Ʒ��Ϣ
		int[] times = new int[4]; // �Ͳ�ʱ��
		String[] addresses = new String[4]; // ���͵�ַ
		int[] states = new int[4]; // ����״̬ 0����Ԥ����1�������
		double[] sumPrices = new double[4]; // �ܽ��

		// ��ʼ��2��������Ϣ
		names[0] = "����";
		dishMegs[0] = "���մ��� 2��";
		times[0] = 12;
		addresses[0] = "����ι����Ķ�У��";
		states[0] = 0;
		sumPrices[0] = 24.0;

		names[1] = "����";
		dishMegs[1] = "������˿ 2��";
		times[1] = 12;
		addresses[1] = "����ι����Ķ�У��";
		states[1] = 1;
		sumPrices[1] = 76.0;

		// �������壬һ���Ʒ��Ϣ
		String[] dishNames = { "���մ���", "������˿", "ʱ���߲�" };
		double[] prices = { 38.0, 20.0, 10.0 };
		int[] praiseNums = new int[3]; // ������

		Scanner input = new Scanner(System.in);
		int num = -1;
		do {
			// ѭ����������ʾ���˵�
			System.out.println("***************");
			System.out.println("1.��Ҫ����");
			System.out.println("2.�鿴�ʹ�");
			System.out.println("3.ǩ�ն���");
			System.out.println("4.ɾ������");
			System.out.println("5.��Ҫ����");
			System.out.println("6.�˳�ϵͳ");
			System.out.println("***************");
			// ��ʾ�û����빦�ܱ�ţ���ִ����Ӧ����
			System.out.print("��ѡ��");
			int choose = input.nextInt();

			boolean isAdd = false; // true����¼�ҵ�һ��Ϊ�յ�λ�ã����Բ��룬false���򲻿���
			switch (choose) {
			case 1:
				// 1.��Ҫ����
				System.out.println("*******��Ҫ����*********");
				// ����Ҫ�����λ��
				for (int i = 0; i < names.length; i++) {
					// ����ҵ�Ϊ�յ�λ��,��¼����
					if (names[i] == null) {
						isAdd = true;// ��¼���ҵ�һ��Ϊ�յ�λ��
						// ִ�в������
						System.out.println("���\t��Ʒ��\t����\t������");
						for (int j = 0; j < dishNames.length; j++) {
							String price = prices[j] + "Ԫ";
							String praise = praiseNums[j] + "��";
							System.out.println(j + 1 + "\t" + dishNames[j] + "\t" + price + "\t" + praise);
						}

						// ������ѡ��Ʒ����Լ�����
						System.out.println("��ѡ����������ţ�");
						int chooseDish = input.nextInt();
						System.out.println("��ѡ����������");
						int number = input.nextInt();
						String dishMeg = dishNames[chooseDish - 1] + " " + number + "��";

						// b.���붩��������
						System.out.println("�����붩����������");
						String name = input.next();

						// c.�����Ͳ�ʱ��
						System.out.println("�������Ͳ�ʱ�䣨10��20�����Ͳͣ�");
						int time = input.nextInt();
						// �������ˣ��ظ�����
						while (time < 10 || time > 20) {
							System.out.println("�Բ���������������������10��20 ֮���������");
							time = input.nextInt();
						}

						// d.�����Ͳ͵�ַ
						System.out.println("�������Ͳ͵�ַ");
						String address = input.next();

						// e.����ͷ�
						double sumPrice = prices[chooseDish - 1] * number;

						// �Ͳͷѣ����ͷѴﵽ50Ԫʱ����6Ԫ��ͷ�
						double deliCharge = sumPrice >= 50 ? 0.0 : 6.0;

						// ��ʾ������Ϣ
						System.out.println("�����ɹ���");
						System.out.println("�������ǣ�" + dishMeg);
						System.out.println("�����ˣ�" + name);
						System.out.println("�Ͳ�ʱ�䣺" + time + "��");
						System.out.println("�Ͳ͵�ַ��" + address);
						System.out.println("�ͷѣ�" + sumPrice + ",�Ͳͷ�:" + deliCharge + "Ԫ");
						System.out.println("�ܽ�" + (sumPrice + deliCharge) + "Ԫ");

						// ��������
						names[i] = name;
						dishMegs[i] = dishMeg;
						times[i] = time;
						addresses[i] = address;
						sumPrices[i] = sumPrice + deliCharge;

						break;
					}
				}
				// ���û���ҵ�Ϊ�յ�λ�ã�����ʾ��Ϣ

				if (!isAdd) {
					System.out.println("�Բ������Ĳʹ�����");
				}
				break;

			case 2:
				// 2.�鿴����
				System.out.println("********�鿴�ʹ�********");
				System.out.println("���\t������\t������Ʒ��Ϣ\t�Ͳ�ʱ��\t�Ͳ͵�ַ\t\t�ܽ��\t״̬");
				// ��������
				for (int i = 0; i < names.length; i++) {
					if (names[i] != null) {
						String time = times[i] + "��";
						String sumPrice = sumPrices[i] + "Ԫ";
						String state = states[i] == 0 ? "��Ԥ��" : "�����";
						System.out.println((i + 1) + "\t" + names[i] + "\t" + dishMegs[i] + "\t" + time + "\t"
								+ addresses[i] + "\t" + sumPrice + "\t" + state);
					}
				}
				break;
			case 3:
				// 3.ǩ�ն���
				System.out.println("******ǩ�ն���**********");
				System.out.println("������Ҫǩ�յĶ�����ţ�");
				int signOrderId = input.nextInt();
				boolean isFind = false; // ��¼�Ƿ��ҵ���������
				// ��������������ѭ��������
				for (int i = 0; i < names.length; i++) {
					if (names[i] != null && states[i] == 1 && signOrderId == i + 1) {
						System.out.println("�Բ�����ѡ��Ķ����Ѿ����ǩ�գ������ٴ�ǩ�գ�");
						isFind = true;
						break;
					} else if (names[i] != null && states[i] == 0 && signOrderId == i + 1) {
						states[i] = 1;// ״ֵ̬��Ϊ����ɶ���
						System.out.println("����ǩ�ճɹ���");
						isFind = true;
						break;
					}
				}
				// �����жϣ����û���ҵ�������������ȥ��ʾû���ҵ�
				if (!isFind) {
					System.out.println("�Բ��𣬴˶��������ڣ�");
				}
				// û�ҵ�����ʾ��Ϣû���ҵ�
				break;
			case 4:
				// 4.ɾ������
				System.out.println("******ɾ������**********");
				System.out.println("������ɾ����������ţ�");
				int delId = input.nextInt();
				// ѭ�����Ҷ������
				boolean isDelFind = false; // �����ж��Ƿ��ҵ�����
				// ��¼ɾ����λ��
				int delIndex = -1;
				for (int i = 0; i < names.length; i++) {
					// �Ѿ�ǩ����ϣ�ִ��ɾ���������ȼ�¼Ҫɾ���Ķ�����ţ�
					// δ���ǩ�գ���ʾ��Ϣ
					// δ�ҵ�������ţ���ʾ��Ϣ
					if (names[i] != null && states[i] == 1 && delId == i + 1) {
						delIndex = i;
						isDelFind = true;
						System.out.println("ɾ���ɹ�");
						break;
					} else if (names[i] != null && states[i] == 0 && delId == i + 1) {
						System.out.println("��ѡ��Ķ�����δǩ�գ�����ɾ����");
						isDelFind = true;
						break;
					}
				}
				if (!isDelFind) {
					System.out.println("�Բ��𣬴˶��������ڣ�");
				}

				// ִ��ɾ������
				if (delIndex != -1) {
					for (int i = delIndex + 1; i < names.length; i++) {
						names[i - 1] = names[i];
						dishMegs[i - 1] = dishMegs[i];
						times[i - 1] = times[i];
						addresses[i - 1] = addresses[i];
						states[i - 1] = states[i];
					}
					// ���һλ���
					names[names.length - 1] = null;
					dishMegs[names.length - 1] = null;
					times[names.length - 1] = 0;
					addresses[names.length - 1] = null;
					states[names.length - 1] = 0;
				}
				break;
			case 5:
				// 5.��Ҫ����
				System.out.println("******��Ҫ����**********");
				// ��ʾ�����޵Ĳ�Ʒ�б�
				System.out.println("���\t��Ʒ��\t����\t������");
				for (int j = 0; j < dishNames.length; j++) {
					String price = prices[j] + "Ԫ";
					String praise = praiseNums[j] + "��";
					System.out.println(j + 1 + "\t" + dishNames[j] + "\t" + price + "\t" + praise);
				}
				// ����Ҫ���޵Ĳ�Ʒ���
				System.out.print("��������Ҫ���޵���ţ�");
				int dishId = input.nextInt();
				// ����ŵĲ�Ʒ���޼�1
				praiseNums[dishId - 1]++;
				// ��ʾ
				System.out.println("���޳ɹ�");
				System.out.println(dishNames[dishId - 1] + " " + praiseNums[dishId - 1] + "��");
				break;
			case 6:
				// 6.�˳�ϵͳ
				break;
			default:
				break;
			}
			// ���û�����Ĺ��ܱ��1��5֮�������ʱ���˳�ѭ�����������ʾ����0����
			if (choose < 1 || choose > 5) {
				break;
			}
			// ��ʾ����0����
			System.out.println("����0���أ�");
			num = input.nextInt();
		} while (num == 0);
		{
			System.out.println("ллʹ�ã���ӭ�´ι��٣�");
			input.close();
		}

	}
}

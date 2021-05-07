package com.kgc.ordermsg;

import java.util.Scanner;

public class Order {

	public static void main(String[] args) {
		// ��ʼ������
		// ��������:һ�鶩����Ϣ
		String[] names = new String[4]; // ����������
		String[] dishMegs = new String[4]; // ��ѡ��Ʒ
		int[] times = new int[4]; // �Ͳ�ʱ��
		String[] addresses = new String[4]; // �Ͳ͵�ַ
		int[] states = new int[4]; // ����״̬: 0 ��Ԥ�� 1 �����
		double[] sumPrices = new double[4]; // �ܽ��

		// ��ʼ������������Ϣ
		names[0] = "����";
		dishMegs[0] = "���մ��� 2��";
		times[0] = 3;
		addresses[0] = "����ι����Ķ�У��";
		sumPrices[0] = 76.0;
		states[0] = 1;

		names[1] = "����";
		dishMegs[1] = "������˿ 2��";
		times[1] = 10;
		addresses[1] = "����ι����Ķ�У��";
		sumPrices[1] = 20.0;

		// ��ѡ��Ĳ�Ʒ��Ϣ
		String[] dishNames = { "���մ���", "������˿", "ʱ���߲�" };
		// ��Ʒ����
		double[] prices = new double[] { 38.0, 20.0, 10 };
		int[] praiseNums = new int[3];
		Scanner input = new Scanner(System.in);
		// �û�����0�������˵�,�����˳�ϵͳ
		int num = -1;
		// ����û��Ƿ��˳�ϵͳ true:�˳�ϵͳ
		boolean isExit = false;
		System.out.println("\n��ӭʹ�óԻ�����ϵͳ");
		// ѭ��:��ʾ�˵�,�����û�ѡ��,ִ����Ӧ����
		do {
			// ��ʾ�˵�
			System.out.println("******************************");
			System.out.println("1:��Ҫ����");
			System.out.println("2:�鿴�ʹ�");
			System.out.println("3:ǩ�ն���");
			System.out.println("4:ɾ������");
			System.out.println("5:��Ҫ����");
			System.out.println("6:�˳�ϵͳ");
			System.out.println("*****************************");
			System.out.println("��ѡ��:");
			// ��¼�û�ѡ���ܵı��
			int choose = input.nextInt();
			// ��¼�û�ѡ��Ĺ��ܱ��
			boolean isAdd = false;
			// �ҵ�Ҫǩ�յĶ���
			boolean isSignFind = false;
			// �ҵ�Ҫɾ���Ķ���
			boolean isDelFind = false;
			// �����û�ѡ��Ĺ��ܱ��ִ����Ӧ����
			switch (choose) {
			case 1:
				// ��Ҫ����
				System.out.println("*********��Ҫ����*********");
				// ѭ��չʾ�˵�
				for (int j = 0; j < names.length; j++) {
					// �ҵ���һ����λ��,������Ӷ�����Ϣ
					if (names[j] == null) {
						// ���λ��,���Զ���
						isAdd = true;
						System.out.println("�����붩���˵�����:");
						String name = input.next();
						// ��ʾ��ѡ��Ĳ�Ʒ��Ϣ
						System.out.println("���" + "\t" + "����" + "\t" + "����");
						for (int i = 0; i < dishNames.length; i++) {
							String price = prices[i] + "Ԫ";
							String priaiseNum = (praiseNums[i]) > 0 ? praiseNums[i] + "��" : "";
							System.out.println((i + 1) + "\t" + dishNames[i] + "\t" + price + "\t" + priaiseNum);
						}
						// �û����
						System.out.println("��ѡ����Ҫ��Ĳ�Ʒ���:");
						int chooseDish = input.nextInt();
						System.out.println("��ѡ������Ҫ�ķ���:");
						int number = input.nextInt();
						String dishMeg = dishNames[chooseDish - 1] + "" + number + "��";
						double sumPrice = prices[chooseDish - 1] * number;
						// �ͷ���50Ԫ,���Ͳͷ�10Ԫ
						double deliCharge = (sumPrice >= 50) ? 0 : 6;
						System.out.println("�������Ͳ�ʱ��(�Ͳ�ʱ����10����20��������Ͳ�:)");
						int time = input.nextInt();
						while (time < 10 || time > 20) {
							System.out.println("����������,������10~20�������!");
							time = input.nextInt();
						}
						System.out.println("�������Ͳ͵�ַ:");
						String address = input.next();
						// �������״̬,Ĭ����0,����Ԥ��״̬.
						System.out.println("���ͳɹ�!");
						System.out.println("��������:" + dishMeg);
						System.out.println("�Ͳ�ʱ����:" + time + "��");
						System.out.println(
								"�ͷ�:" + sumPrice + "Ԫ,�Ͳͷ�" + deliCharge + "Ԫ,�ܼ�:" + (sumPrice + deliCharge) + "Ԫ");
						// �������
						names[j] = name;
						dishMegs[j] = dishMeg;
						times[j] = time;
						addresses[j] = address;
						sumPrices[j] = sumPrice + deliCharge;
						break;
					}
				}
				if (!isAdd) {
					System.out.println("�Բ���,���Ĳʹ�����!");
				}
				break;
			case 2:
				// �鿴�ʹ�
				System.out.println("*********�鿴�ʹ�**********");
				System.out.println("���\t������\t��Ʒ��Ϣ\t\t�Ͳ�����\t�Ͳ͵�ַ\t\t�ܽ��\t����״̬");
				for (int i = 0; i < names.length; i++) {
					// �鿴�ʹ��е�����,����ǿվ����������ڲ鿴
					if (names[i] != null) {
						String state = (states[i] == 0) ? "��Ԥ��" : "�����";
						String date = times[i] + "��";
						String sumPrice = sumPrices[i] + "Ԫ";
						System.out.println((i + 1) + "\t" + names[i] + "\t" + dishMegs[i] + "\t" + addresses[i] + "\t"
								+ sumPrice + "\t" + state);
					}
				}
				break;
			case 3:
				// ǩ�ն���
				System.out.println("***********ǩ�ն���*************");
				System.out.println("��ѡ��Ҫǩ�յĶ������:");
				int signOrderId = input.nextInt();
				for (int i = 0; i < names.length; i++) {
					// ״̬Ϊ��Ԥ��,���Ϊ�û�����Ķ������:��ǩ��
					// ״̬Ϊ�����,���Ϊ�û����붩�����:����ǩ��
					if (names[i] != null && states[i] == 0 && signOrderId == i + 1) {
						states[i] = 1; // ��״ֵ̬��Ϊ�����
						System.out.println("����ǩ�ճɹ�!");
						isSignFind = true;
					} else if (names[i] != null && states[i] == 1 && signOrderId == i + 1) {
						System.out.println("��ѡ��Ķ��������ǩ��,�����ٴ�ǩ��");
						isSignFind = true;
					}
				}
				// δ�ҵ��Ķ������:����ǩ��
				if (!isSignFind) {
					System.out.println("��ѡ��Ķ���������!");
				}
				break;
			case 4:
				// ɾ������
				System.out.println("**************ɾ������****************");
				System.out.println("������Ҫɾ���Ķ������:");
				int delId = input.nextInt();
				for (int i = 0; i < names.length; i++) {
					// ״ֵ̬Ϊ����� ���ֵΪ�û��������ţ���ɾ��
					// ״ֵ̬Ϊ��Ԥ�� ���ֵΪ�û��������ţ�����ɾ��
					if (names[i] != null && states[i] == 1 && delId == i + 1) {
						isDelFind = true;
						// ִ��ɾ������:ɾ��λ�ú��Ԫ������ǰ��
						for (int j = delId - 1; j < names.length - 1; j++) {
							names[j] = names[j + 1];
							dishMegs[j] = dishMegs[j + 1];
							times[j] = times[j + 1];
							addresses[j] = addresses[j + 1];
							states[j] = states[j + 1];
						}
						// ���һλ���
						names[names.length - 1] = null;
						dishMegs[names.length - 1] = null;
						times[names.length] = 0;
						addresses[names.length - 1] = null;
						states[names.length - 1] = 0;
						System.out.println("ɾ�������ɹ�!");
						break;
					} else if (names[i] != null && states[i] == 0 && delId == i + 1) {
						System.out.println("��ѡ��Ķ���δǩ��,����ɾ��!");
						isDelFind = true;
						break;
					}
				}
				// δ�ҵ�����ŵĶ���,����ɾ��
				if (isDelFind) {
					System.out.println("��Ҫɾ���Ķ���������!");
				}
				break;
			case 5:
				// ��Ҫ����
				System.out.println("**********��Ҫ����**********");
				// ��ʾ��Ʒ��Ϣ
				System.out.println("���" + "\t" + "����" + "\t" + "����");
				for (int i = 0; i < dishNames.length; i++) {
					String price = prices[i] + "Ԫ";
					String priaiseNum = (praiseNums[i]) > 0 ? praiseNums[i] + "��" : "";
					System.out.println((i + 1) + "\t" + dishNames[i] + "\t" + price + "\t" + priaiseNum);
				}
				System.out.println("��ѡ����Ҫ���޵Ĳ�Ʒ���:");
				int praiseNum = input.nextInt();
				praiseNums[praiseNum - 1]++; // ������+1
				System.out.println("���޳ɹ�!");
				break;
			case 6:
				// �˳�ϵͳ
				isExit = true;
				break;
			default:
				// �˳�ϵͳ
				isExit = true;
				break;
			}
			if (!isExit) {
				System.out.println("����0����:");
				num = input.nextInt();
			} else {
				break;
			}
		} while (num == 0);
		System.out.println("��лʹ��,��ӭ�´ι���!");
		input.close();
	}

}

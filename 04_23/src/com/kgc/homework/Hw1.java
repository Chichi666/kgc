package com.kgc.homework;

import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {
		double[] total = new double[5];
		double sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("�������Ա���µ����Ѽ�¼");
		for (int i = 0; i < total.length; i++) {
			System.out.println("�������" + (i + 1) + "�ʹ����");
			total[i] = input.nextDouble();
			sum += total[i];
		}
		System.out.println("��� " + "			" + "��Ԫ��");
		for (int i = 0; i < total.length; i++) {
			System.out.println((i + 1) + "			" + total[i]);
		}
		System.out.println("�ܽ�� " + "			" + sum);
	}

}

package com.kgc.morning;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		int[][] array = new int[5][5];
		int[] total = new int[5];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("*****��" + (i + 1) + "���༶��*****");
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("�������" + (j + 1) + "��ѧ���ɼ���");
				array[i][j] = input.nextInt();
				total[i] += array[i][j];
			}
		}
		for (int i = 0; i < total.length; i++) {
			System.out.println("*****��" + (i + 1) + "���༶���ܳɼ�Ϊ��" + total[i] + " *****");
		}
	}

}

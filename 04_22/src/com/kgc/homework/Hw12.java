package com.kgc.homework;

import java.util.Scanner;

public class Hw12 {
	// ��ӡ1~100����������
	public static void main(String[] args) {
		int i = 0, sum = 0;
		System.out.println("����һ��С��100��ֵ��");
		Scanner input = new Scanner(System.in);
		i = input.nextInt();
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println("����Ӹ�ֵ��100���������ĺ�" + sum);
	}

}

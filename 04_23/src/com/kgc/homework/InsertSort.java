package com.kgc.homework;

import java.util.Scanner;

public class InsertSort {

	public static void main(String[] args) {
		int[] list = new int[6];// 定义一个长度为6的数组
		// 对前五个赋值
		list[0] = 99;
		list[1] = 85;
		list[2] = 82;
		list[3] = 63;
		list[4] = 60;
		System.out.println("请输入新增成绩：");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		// 定义一个插入数组位置的下标变量index
		int index = 0;
		for (int i = 0; i < list.length; i++) {
			// 判断输入的数是否大于数组中的数
			if (num > list[i]) {
				// 当前数组所在的下标赋值给插入数据下标
				index = i;
				break;
			}
		}
		// 将数组元素后移
		for (int i = list.length - 1; i > index; i--) {
			// 从最后一个数据开始后移
			list[i] = list[i - 1];
		}
		// 插入数据
		list[index] = num;
		System.out.println("插入成绩的下标是：" + index);
		System.out.println("插入后的成绩信息是：");
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i] + "\t");
		}
		// for (int i : list) {
		// System.out.println(i);
		// }
	}

}

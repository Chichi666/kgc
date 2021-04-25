package com.kgc.afternoon;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// 创建了一个长度为6的数组
		int[] list = new int[6];
		// 给数组的前5个位置进行赋值
		list[0] = 99;
		list[1] = 85;
		list[2] = 82;
		list[3] = 63;
		list[4] = 60;
		// 保存新增成绩插入位置
		int index = list.length;
		System.out.println("请输入新增成绩:");
		// 输入插入的成绩
		Scanner input = new Scanner(System.in);
		// 从键盘接收成绩
		int num = input.nextInt();
		// 遍历数组
		for (int i = 0; i < list.length; i++) {
			// 判断,如果我输入的数>数组中的任何一个元素
			if (num > list[i]) {
				// 数组的下标赋值给插入数据的下标
				index = i; // 可能出现的值是:1,2,3,4,5
				// 跳出循环
				break;
			}
		}
		// 元素后移 给数组留出一个空间
		for (int j = list.length - 1; j > index; j--) {
			// index下标开始的元素后移一个位置
			list[j] = list[j - 1];
		}
		// 向数组插入输入的数据
		list[index] = num;
		// 输出了数组的下标
		System.out.println("插入成绩的下标是:" + index);
		// 提示插入后的信息
		System.out.println("插入后的成绩信息是:");
		// 遍历数组
		for (int k = 0; k < list.length; k++) {
			System.out.println(list[k] + "\t");
		}
		// for (int i : list) {
		// System.out.println(i);
		// }
	}

}

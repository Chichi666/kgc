package com.kgc.homework;

import java.util.Arrays;

public class Hw02 {

	public static void main(String[] args) {
		int[] a1 = { 5, 3, 2, 1, 4 };
		int[] a2 = { 55, 99, 11, 22, 88 };

		// equal方法
		boolean eq = Arrays.equals(a1, a2);
		System.out.println(eq);

		// 对array排序 升序
		Arrays.sort(a1);
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}

		// 把array转化为一个字符串
		String str = Arrays.toString(a2);
		System.out.println(str);

		// 把array数组赋值为val
		// Arrays.fill(a1, 88);
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}

		// 把数组复制成一个长度为length的新数组
		// 超过数组长度用0补
		int[] a3 = Arrays.copyOf(a1, 8);
		for (int i = 0; i < a3.length; i++) {
			System.out.print(a3[i] + " ");
		}
		System.out.println("");
		// 查询数组下标
		int bs = Arrays.binarySearch(a1, 3);
		System.out.println(bs);
	}

}

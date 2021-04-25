package com.kgc.kt.afternoon;

import java.util.Scanner;

public class Demo02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// while (true) {
		// System.out.println("上午阅读教材，学习理论部分");
		// System.out.println("是否完成？Y/N");
		// String flag1 = input.next();
		// if (flag1.equals("Y")) {
		// System.out.println("下午上机编程，掌握代码部分");
		// System.out.println("是否完成？Y/N");
		// String flag2 = input.next();
		// if (flag2.equals("Y")) {
		// System.out.println("完成作业，合格");
		// break;
		// }
		// }
		// }

		do {
			System.out.println("上午阅读教材，学习理论部分");
			System.out.println("是否完成？Y/N");
			String flag1 = input.next();
			if (flag1.equals("Y")) {
				System.out.println("下午上机编程，掌握代码部分");
				System.out.println("是否完成？Y/N");
				String flag2 = input.next();
				if (flag2.equals("Y")) {
					System.out.println("完成作业，合格");
					break;
				}
			}
		} while (true);
	}
}
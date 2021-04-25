package com.kgc.kt.morning;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		int javac = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入java成绩：");
		javac = scanner.nextInt();
		if (javac > 90) {
			System.out.println("就算成功");
		}
	}

}

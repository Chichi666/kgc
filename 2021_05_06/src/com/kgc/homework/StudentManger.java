package com.kgc.homework;

public class StudentManger {
	// 定义学生数组，长度为30
	String[] names = new String[30];

	// 定义添加姓名的方法,参数是姓名
	public void addNames(String name) {
		// 遍历姓名数组
		for (int i = 0; i < names.length; i++) {
			// 判断姓名数组中是否有空值，若有，则把姓名赋值给数组
			if (names[i] == null) {
				names[i] = name;
				break;
			}
		}
	}

	// 定义姓名数组展示方法
	public void showNames() {
		// 遍历姓名数组
		for (int i = 0; i < names.length; i++) {
			// 判断姓名数组是否为空，若不空则打印出姓名
			if (names[i] != null) {
				System.out.println(names[i]);
			}
		}
	}

	// 定义查找姓名的方法，参数为开始位置，结束位置，查找姓名
	public boolean searchNames(int start, int end, String name) {
		// 定义一个查找的标记，初始为false，找到置为true
		boolean flag = false;
		// 从start位置开始，end位置结束，遍历姓名
		for (int i = start; i <= end; i++) {
			// 找到符合的姓名
			if (names[i].equals(name)) {
				// flag置为true
				flag = true;
				break;
			}
		}
		return flag;

	}
}

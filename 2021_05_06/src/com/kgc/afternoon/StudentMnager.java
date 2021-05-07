package com.kgc.afternoon;

public class StudentMnager {
	String[] names = new String[30];

	// 创建一个增添学员的方法
	public void addName(String name) {
		boolean isAdd = false;
		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) {
				names[i] = name;
				System.out.println("新增学员姓名：" + name + "，完成！\n");
				isAdd = true;
				break;
			}
		}
		if (!isAdd) {
			System.out.println("抱歉！您增添的学生姓名管理信息已满暂时无法添加");
		}
	}

	public void showNames() {
		System.out.println("====本班学生列表====");
		for (int i = 0; i < names.length; i++) {
			if (names[i] != null) {
				System.out.println(names[i] + "\t");
			}
		}
	}

	public boolean searchNames(int start, int end, String name) {
		// 定义一个结果的布尔型变量 ，用于判定学生姓名是否在数组范围内
		boolean flag = false;
		// 遍历数组查找区间首先做数组遍历
		for (int i = start; i < end; i++) {
			if (names[i].equals(name)) {
				flag = true;
				break;
			} else {
				flag = false;
				break;
			}
		}
		return flag; // 放回查询结果
	}
}

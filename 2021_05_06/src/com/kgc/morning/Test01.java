package com.kgc.morning;

public class Test01 {

	public static void main(String[] args) {
		Stu stu1 = new Stu();
		System.out.println(stu1.name);
		System.out.println("���䣺" + stu1.age);
		System.out.println("�Ͷ��ڣ�" + stu1.classes);
		System.out.println("���ã�" + stu1.hobby);
		System.out.println("");
		Teacher teacher1 = new Teacher();
		System.out.println(teacher1.name);
		System.out.println("רҵ����" + teacher1.direction);
		System.out.println("���ڿγ̣�" + teacher1.tproject);
		System.out.println("���䣺" + teacher1.tage);
	}

}

package com.kgc.homework;

public class Test01 {

	public static void main(String[] args) {
		Students stu1 = new Students();
		Teachers teac1 = new Teachers();
		Classes cla1 = new Classes();
		Project pro1 = new Project();
		SPT spt1 = new SPT();
		System.out.println(stu1.name + "��" + cla1.local + "��" + pro1.name + "��");
		System.out.println(pro1.name + "�ε���ʦ��" + teac1.name);
		System.out.println("�ɼ��ǣ�" + spt1.grade);
	}

}

package com.kgc.afternoon;

public class StudentMnager {
	String[] names = new String[30];

	// ����һ������ѧԱ�ķ���
	public void addName(String name) {
		boolean isAdd = false;
		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) {
				names[i] = name;
				System.out.println("����ѧԱ������" + name + "����ɣ�\n");
				isAdd = true;
				break;
			}
		}
		if (!isAdd) {
			System.out.println("��Ǹ���������ѧ������������Ϣ������ʱ�޷����");
		}
	}

	public void showNames() {
		System.out.println("====����ѧ���б�====");
		for (int i = 0; i < names.length; i++) {
			if (names[i] != null) {
				System.out.println(names[i] + "\t");
			}
		}
	}

	public boolean searchNames(int start, int end, String name) {
		// ����һ������Ĳ����ͱ��� �������ж�ѧ�������Ƿ������鷶Χ��
		boolean flag = false;
		// ����������������������������
		for (int i = start; i < end; i++) {
			if (names[i].equals(name)) {
				flag = true;
				break;
			} else {
				flag = false;
				break;
			}
		}
		return flag; // �Żز�ѯ���
	}
}

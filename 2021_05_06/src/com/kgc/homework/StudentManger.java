package com.kgc.homework;

public class StudentManger {
	// ����ѧ�����飬����Ϊ30
	String[] names = new String[30];

	// ������������ķ���,����������
	public void addNames(String name) {
		// ������������
		for (int i = 0; i < names.length; i++) {
			// �ж������������Ƿ��п�ֵ�����У����������ֵ������
			if (names[i] == null) {
				names[i] = name;
				break;
			}
		}
	}

	// ������������չʾ����
	public void showNames() {
		// ������������
		for (int i = 0; i < names.length; i++) {
			// �ж����������Ƿ�Ϊ�գ����������ӡ������
			if (names[i] != null) {
				System.out.println(names[i]);
			}
		}
	}

	// ������������ķ���������Ϊ��ʼλ�ã�����λ�ã���������
	public boolean searchNames(int start, int end, String name) {
		// ����һ�����ҵı�ǣ���ʼΪfalse���ҵ���Ϊtrue
		boolean flag = false;
		// ��startλ�ÿ�ʼ��endλ�ý�������������
		for (int i = start; i <= end; i++) {
			// �ҵ����ϵ�����
			if (names[i].equals(name)) {
				// flag��Ϊtrue
				flag = true;
				break;
			}
		}
		return flag;

	}
}

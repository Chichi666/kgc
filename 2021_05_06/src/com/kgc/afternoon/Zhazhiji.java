package com.kgc.afternoon;

public class Zhazhiji {
	// ����ե֭����������ΪString���͵�fruit
	public String zhazhi(String fruit) {
		// ��fruit + "֭" ��ֵ��juice
		String juice = fruit + "֭";
		// ����juice
		return juice;
	}

	public static void main(String[] args) {
		// ʵ����ե֭��
		Zhazhiji myZhazhiji = new Zhazhiji();
		// ����ˮ������
		String myFruit = "ƻ��";
		// ����ե֭����ե֭����������ƻ��
		String myJuice = myZhazhiji.zhazhi(myFruit);
		System.out.println(myJuice);
	}

}

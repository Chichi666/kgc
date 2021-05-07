package com.kgc.afternoon;

public class Zhazhiji02 {
	public String zhazhi(String fruit) {
		String juice = fruit + "Ö­";
		return juice;
	}

	public static void main(String[] args) {
		Zhazhiji02 myZhazhiji = new Zhazhiji02();
		String myFruit = "Æ»¹û";
		String myJuice = myZhazhiji.zhazhi(myFruit);
		System.out.println(myJuice);
	}

}

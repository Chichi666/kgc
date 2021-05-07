package com.kgc.afternoon;

public class Zhazhiji {
	// 创建榨汁方法，参数为String类型的fruit
	public String zhazhi(String fruit) {
		// 把fruit + "汁" 赋值给juice
		String juice = fruit + "汁";
		// 返回juice
		return juice;
	}

	public static void main(String[] args) {
		// 实例化榨汁机
		Zhazhiji myZhazhiji = new Zhazhiji();
		// 定义水果变量
		String myFruit = "苹果";
		// 调用榨汁机的榨汁方法，放入苹果
		String myJuice = myZhazhiji.zhazhi(myFruit);
		System.out.println(myJuice);
	}

}

package com.kgc.eat;

import java.util.Scanner;

public class Eatm {
	public static void main(String[] args) {
		// 数据主体；一组订单信息
		String[] names = new String[4]; // 订餐人
		String[] dishMegs = new String[4]; // 所定餐品信息
		int[] times = new int[4]; // 送餐时间
		String[] addresses = new String[4]; // 订餐地址
		int[] states = new int[4]; // 订单状态 0：已预订；1：已完成
		double[] sumPrices = new double[4]; // 总金额

		// 初始化2条订单信息
		names[0] = "张晴";
		dishMegs[0] = "红烧带鱼 2份";
		times[0] = 12;
		addresses[0] = "北大课工场文鼎校区";
		states[0] = 0;
		sumPrices[0] = 24.0;

		names[1] = "张晴";
		dishMegs[1] = "鱼香肉丝 2份";
		times[1] = 12;
		addresses[1] = "北大课工场文鼎校区";
		states[1] = 1;
		sumPrices[1] = 76.0;

		// 数据主体，一组餐品信息
		String[] dishNames = { "红烧带鱼", "鱼香肉丝", "时令蔬菜" };
		double[] prices = { 38.0, 20.0, 10.0 };
		int[] praiseNums = new int[3]; // 点赞数

		Scanner input = new Scanner(System.in);
		int num = -1;
		do {
			// 循环操作：显示主菜单
			System.out.println("***************");
			System.out.println("1.我要订餐");
			System.out.println("2.查看餐袋");
			System.out.println("3.签收订单");
			System.out.println("4.删除订单");
			System.out.println("5.我要点赞");
			System.out.println("6.退出系统");
			System.out.println("***************");
			// 提示用户输入功能编号，并执行相应功能
			System.out.print("请选择：");
			int choose = input.nextInt();

			boolean isAdd = false; // true：记录找到一个为空的位置，可以插入，false：则不可用
			switch (choose) {
			case 1:
				// 1.我要订餐
				System.out.println("*******我要订餐*********");
				// 查找要插入的位置
				for (int i = 0; i < names.length; i++) {
					// 如果找到为空的位置,记录下来
					if (names[i] == null) {
						isAdd = true;// 记录已找到一个为空的位置
						// 执行插入操作
						System.out.println("序号\t餐品名\t单价\t点赞数");
						for (int j = 0; j < dishNames.length; j++) {
							String price = prices[j] + "元";
							String praise = praiseNums[j] + "赞";
							System.out.println(j + 1 + "\t" + dishNames[j] + "\t" + price + "\t" + praise);
						}

						// 输入所选餐品编号以及份数
						System.out.println("请选择所订餐序号：");
						int chooseDish = input.nextInt();
						System.out.println("请选择所定份数");
						int number = input.nextInt();
						String dishMeg = dishNames[chooseDish - 1] + " " + number + "份";

						// b.输入订餐人姓名
						System.out.println("请输入订餐人姓名：");
						String name = input.next();

						// c.输入送餐时间
						System.out.println("请输入送餐时间（10到20整点送餐）");
						int time = input.nextInt();
						// 如果输错了，重复输入
						while (time < 10 || time > 20) {
							System.out.println("对不起，您的输入有误，请输入10到20 之间的整数：");
							time = input.nextInt();
						}

						// d.输入送餐地址
						System.out.println("请输入送餐地址");
						String address = input.next();

						// e.计算餐费
						double sumPrice = prices[chooseDish - 1] * number;

						// 送餐费，当餐费达到50元时，免6元配餐费
						double deliCharge = sumPrice >= 50 ? 0.0 : 6.0;

						// 显示订单信息
						System.out.println("订单成功！");
						System.out.println("您订的是：" + dishMeg);
						System.out.println("订餐人：" + name);
						System.out.println("送餐时间：" + time + "点");
						System.out.println("送餐地址：" + address);
						System.out.println("餐费：" + sumPrice + ",送餐费:" + deliCharge + "元");
						System.out.println("总金额：" + (sumPrice + deliCharge) + "元");

						// 保存数据
						names[i] = name;
						dishMegs[i] = dishMeg;
						times[i] = time;
						addresses[i] = address;
						sumPrices[i] = sumPrice + deliCharge;

						break;
					}
				}
				// 如果没有找到为空的位置，则提示信息

				if (!isAdd) {
					System.out.println("对不起，您的餐袋已满");
				}
				break;

			case 2:
				// 2.查看订餐
				System.out.println("********查看餐袋********");
				System.out.println("序号\t订餐人\t所订餐品信息\t送餐时间\t送餐地址\t\t总金额\t状态");
				// 遍历数组
				for (int i = 0; i < names.length; i++) {
					if (names[i] != null) {
						String time = times[i] + "点";
						String sumPrice = sumPrices[i] + "元";
						String state = states[i] == 0 ? "已预订" : "已完成";
						System.out.println((i + 1) + "\t" + names[i] + "\t" + dishMegs[i] + "\t" + time + "\t"
								+ addresses[i] + "\t" + sumPrice + "\t" + state);
					}
				}
				break;
			case 3:
				// 3.签收订单
				System.out.println("******签收订单**********");
				System.out.println("请输入要签收的订单序号：");
				int signOrderId = input.nextInt();
				boolean isFind = false; // 记录是否找到这条订单
				// 查找这条订单（循环遍历）
				for (int i = 0; i < names.length; i++) {
					if (names[i] != null && states[i] == 1 && signOrderId == i + 1) {
						System.out.println("对不起，您选择的订单已经完成签收，不能再次签收！");
						isFind = true;
						break;
					} else if (names[i] != null && states[i] == 0 && signOrderId == i + 1) {
						states[i] = 1;// 状态值改为已完成订单
						System.out.println("订单签收成功！");
						isFind = true;
						break;
					}
				}
				// 条件判断，如果没有找到这条订单，才去提示没有找到
				if (!isFind) {
					System.out.println("对不起，此订单不存在！");
				}
				// 没找到，提示信息没有找到
				break;
			case 4:
				// 4.删除订单
				System.out.println("******删除订单**********");
				System.out.println("请输入删除订单的序号：");
				int delId = input.nextInt();
				// 循环查找订单序号
				boolean isDelFind = false; // 用来判断是否找到订单
				// 记录删除的位置
				int delIndex = -1;
				for (int i = 0; i < names.length; i++) {
					// 已经签收完毕：执行删除操作（先记录要删出的订单序号）
					// 未完成签收：提示信息
					// 未找到订单序号：提示信息
					if (names[i] != null && states[i] == 1 && delId == i + 1) {
						delIndex = i;
						isDelFind = true;
						System.out.println("删除成功");
						break;
					} else if (names[i] != null && states[i] == 0 && delId == i + 1) {
						System.out.println("您选择的订单还未签收，不能删除！");
						isDelFind = true;
						break;
					}
				}
				if (!isDelFind) {
					System.out.println("对不起，此订单不存在！");
				}

				// 执行删除操作
				if (delIndex != -1) {
					for (int i = delIndex + 1; i < names.length; i++) {
						names[i - 1] = names[i];
						dishMegs[i - 1] = dishMegs[i];
						times[i - 1] = times[i];
						addresses[i - 1] = addresses[i];
						states[i - 1] = states[i];
					}
					// 最后一位清空
					names[names.length - 1] = null;
					dishMegs[names.length - 1] = null;
					times[names.length - 1] = 0;
					addresses[names.length - 1] = null;
					states[names.length - 1] = 0;
				}
				break;
			case 5:
				// 5.我要点赞
				System.out.println("******我要点赞**********");
				// 显示供点赞的餐品列表
				System.out.println("序号\t餐品名\t单价\t点赞数");
				for (int j = 0; j < dishNames.length; j++) {
					String price = prices[j] + "元";
					String praise = praiseNums[j] + "赞";
					System.out.println(j + 1 + "\t" + dishNames[j] + "\t" + price + "\t" + praise);
				}
				// 输入要点赞的餐品序号
				System.out.print("请输入需要点赞的序号：");
				int dishId = input.nextInt();
				// 该序号的餐品点赞加1
				praiseNums[dishId - 1]++;
				// 显示
				System.out.println("点赞成功");
				System.out.println(dishNames[dishId - 1] + " " + praiseNums[dishId - 1] + "赞");
				break;
			case 6:
				// 6.退出系统
				break;
			default:
				break;
			}
			// 当用户输入的功能编号1到5之外的数字时，退出循环，否则会提示输入0返回
			if (choose < 1 || choose > 5) {
				break;
			}
			// 提示输入0返回
			System.out.println("输入0返回：");
			num = input.nextInt();
		} while (num == 0);
		{
			System.out.println("谢谢使用，欢迎下次光临！");
			input.close();
		}

	}
}

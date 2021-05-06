package com.kgc.atm;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		int orpwd = 123456; // 初始密码
		int deposit = 800; // 初始存款
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("请输入密码：");
			int inpwd = input.nextInt();
			if (inpwd == orpwd) {
				break;
			} else {
				System.out.println("密码输入错误，还有" + (2 - i) + "次机会");
				continue;
			}
		}
		int num = -1; // 功能编号
		do {
			System.out.println("====ATM机管理系统====");
			System.out.println("1：取款");
			System.out.println("2：存款");
			System.out.println("3：查询");
			System.out.println("4：转账");
			System.out.println("0：退出");
			int choose = input.nextInt();
			switch (choose) {
			case 1:
				System.out.println("====取款选项====");
				System.out.println("1：100");
				System.out.println("2：200");
				System.out.println("3：500");
				System.out.println("4：1000");
				System.out.println("输入你要取款的编号：");
				int qknum = input.nextInt();
				switch (qknum) {
				case 1:
					if (deposit >= 100) {
						deposit -= 100;
						System.out.println("已取100元");
					} else {
						System.out.println("余额不足！");
					}
					break;
				case 2:
					if (deposit >= 200) {
						deposit -= 200;
						System.out.println("已取200元");
					} else {
						System.out.println("余额不足！");
					}
					break;
				case 3:
					if (deposit >= 500) {
						deposit -= 500;
						System.out.println("已取500元");
					} else {
						System.out.println("余额不足！");
					}
					break;
				case 4:
					if (deposit >= 1000) {
						deposit -= 1000;
						System.out.println("已取1000元");
					} else {
						System.out.println("余额不足！");
					}
					break;
				default:
					System.out.println("输入错误请重新输入");
					break;
				}
				break;
			case 2:
				System.out.println("====存款====");
				System.out.println("输入存款金额：");
				int indeposit = input.nextInt();
				System.out.println("确认存入" + indeposit + "元吗？（y/n）");
				String judge = input.next();
				if (judge.equals("y")) {
					deposit += indeposit;
					System.out.println("已存入" + indeposit + "元");
				} else {
					break;
				}
				break;
			case 3:
				System.out.println("====查询余额====");
				System.out.println("账户余额为：" + deposit);
				break;
			case 4:
				System.out.println("====转账====");
				System.out.println("输入要转账的金额:");
				int transfer = input.nextInt();
				if (transfer > deposit) {
					System.out.println("余额不足，转账失败");
				} else {
					deposit -= transfer;
					System.out.println("已转账" + transfer + "元");
				}
				break;
			case 0:
				// System.out.println("已退出，请收好你的银行卡");
				break;
			default:
				break;
			}
			if (choose <= 0 || choose > 4) {
				break;
			}
			// 提示输入0返回
			System.out.println("输入0返回：");
			num = input.nextInt();
		} while (num == 0);
		{
			System.out.println("已退出，请收好你的银行卡");
		}
	}

}

package com.kgc.pro;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		boolean flag = true; // 跳出循环标记
		String[] movie = { "美国队长", "圣杯战争", "小黄人", "星球大战", "金牌特工" }; // 电影信息数组
		int[] moviesum = new int[5]; // 电影票综述
		int[] moviepoint = new int[5]; // 电影喜爱度评分
		do {
			System.out.println("**********欢迎光临影院购票系统**********");
			System.out.println("**	    1.查看预告简介		**");
			System.out.println("** 	    2.调查吸引度		**");
			System.out.println("**	    3.购票		**");
			System.out.println("**	    0.退出购票系统		**");
			System.out.println("**********************************");
			System.out.println("请输入功能编号：");
			Scanner input = new Scanner(System.in); // 输入
			int n = input.nextInt();
			switch (n) {
			case 1:
				boolean flag1 = true;
				do {
					System.out.println("~~~~~~~~~~欢迎查看预告简介~~~~~~~~~~");
					for (int i = 0; i < movie.length; i++) {
						System.out.println("~~" + "\t    " + (i + 1) + "." + movie[i] + "\t     " + "~~");
					}
					System.out.println("~~" + "\t    " + "0.返回上一级" + "\t     " + "~~");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("请输入电影编号：");
					int num1 = input.nextInt();
					switch (num1) {
					case 1:
						System.out.println(movie[0]);
						break;

					case 2:
						System.out.println(movie[1]);
						break;

					case 3:
						System.out.println(movie[2]);
						break;

					case 4:
						System.out.println(movie[3]);
						break;

					case 5:
						System.out.println(movie[4]);
						break;
					case 0:
						break;
					default: {
						System.out.println("请输入正确的影片编号");
						break;
					}
					}
					if (num1 == 0) {
						flag1 = false;
					}
				} while (flag1);
				break;

			case 2:
				int sum = 0;
				for (int i = 0; i < moviepoint.length; i++) {
					System.out.println("请输入对第" + (i + 1) + "部电影《" + movie[i] + "》感兴趣的人数：");
					moviepoint[i] = input.nextInt();
					sum += moviepoint[i];
				}
				for (int i = 0; i < moviepoint.length; i++) {
					System.out
							.println("第" + (i + 1) + "部电影《" + movie[i] + "》的吸引度是：" + (moviepoint[i] / sum) * 100 + "%");

				}
				break;

			case 3:
				boolean flag3 = true;
				boolean flag31 = true;
				int psum = 0;
				do {
					System.out.println("~~~~~~~~~~请选择你喜欢的电影~~~~~~~~~~");
					for (int i = 0; i < movie.length; i++) {
						System.out.println("~~" + "\t    " + (i + 1) + "." + movie[i] + "\t     " + "~~");
					}
					System.out.println("~~" + "\t    " + "0.返回上一级 " + "\t     " + "~~");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("请输入你喜欢的电影编号：");
					int num3 = input.nextInt();
					switch (num3) {
					case 1:
						System.out.println("你选择的电影是：" + movie[0]);
						do {
							System.out.println("请输入购票张数（0退出本次购买）：");
							int innum = input.nextInt();
							do {
								if (innum == 0) {
									System.out.println("是否继续购买其他电影票？(1:继续购买，0：不再购买）：");
									int numcon = input.nextInt();
									do {
										if (numcon == 0) {
											flag31 = false;
											// break;
										}

										break;
									} while (flag31);
									break;
								} else {
									moviesum[0] += innum * 35;
									System.out.println("确认结算（1：确认，0：放弃）：");
									int innum1 = input.nextInt();
									do {
										if (innum1 == 0) {
											flag31 = false;
										} else {
											System.out.println("当前总费用为：" + moviesum[0]);
											break;
										}
									} while (flag31);
								}
							} while (flag31);

						} while (flag31);
						break;
					case 2:
						System.out.println("你选择的电影是：" + movie[1]);
						do {
							System.out.println("请输入购票张数（0退出本次购买）：");
							int innum = input.nextInt();
							do {
								if (innum == 0) {
									System.out.println("是否继续购买其他电影票？(1:继续购买，0：不再购买）：");
									int numcon = input.nextInt();
									do {
										if (numcon == 0) {
											flag31 = false;
											// break;
										}

										break;
									} while (flag31);
									break;
								} else {
									moviesum[1] += innum * 35;
									System.out.println("确认结算（1：确认，0：放弃）：");
									int innum1 = input.nextInt();
									do {
										if (innum1 == 0) {
											flag31 = false;
										} else {
											System.out.println("当前总费用为：" + moviesum[1]);
											break;
										}
									} while (flag31);
								}
							} while (flag31);

						} while (flag31);
						break;

					case 3:
						System.out.println("你选择的电影是：" + movie[2]);
						do {
							System.out.println("请输入购票张数（0退出本次购买）：");
							int innum = input.nextInt();
							do {
								if (innum == 0) {
									System.out.println("是否继续购买其他电影票？(1:继续购买，0：不再购买）：");
									int numcon = input.nextInt();
									do {
										if (numcon == 0) {
											flag31 = false;
											// break;
										}

										break;
									} while (flag31);
									break;
								} else {
									moviesum[2] += innum * 35;
									System.out.println("确认结算（1：确认，0：放弃）：");
									int innum1 = input.nextInt();
									do {
										if (innum1 == 0) {
											flag31 = false;
										} else {
											System.out.println("当前总费用为：" + moviesum[2]);
											break;
										}
									} while (flag31);
								}
							} while (flag31);

						} while (flag31);
						break;

					case 4:
						System.out.println("你选择的电影是：" + movie[3]);
						do {
							System.out.println("请输入购票张数（0退出本次购买）：");
							int innum = input.nextInt();
							do {
								if (innum == 0) {
									System.out.println("是否继续购买其他电影票？(1:继续购买，0：不再购买）：");
									int numcon = input.nextInt();
									do {
										if (numcon == 0) {
											flag31 = false;
											// break;
										}

										break;
									} while (flag31);
									break;
								} else {
									moviesum[3] += innum * 35;
									System.out.println("确认结算（1：确认，0：放弃）：");
									int innum1 = input.nextInt();
									do {
										if (innum1 == 0) {
											flag31 = false;
										} else {
											System.out.println("当前总费用为：" + moviesum[3]);
											break;
										}
									} while (flag31);
								}
							} while (flag31);

						} while (flag31);
						break;

					case 5:
						System.out.println("你选择的电影是：" + movie[4]);
						do {
							System.out.println("请输入购票张数（0退出本次购买）：");
							int innum = input.nextInt();
							do {
								if (innum == 0) {
									System.out.println("是否继续购买其他电影票？(1:继续购买，0：不再购买）：");
									int numcon = input.nextInt();
									do {
										if (numcon == 0) {
											flag31 = false;
											// break;
										}

										break;
									} while (flag31);
									break;
								} else {
									moviesum[4] += innum * 35;
									System.out.println("确认结算（1：确认，0：放弃）：");
									int innum1 = input.nextInt();
									do {
										if (innum1 == 0) {
											flag31 = false;
										} else {
											System.out.println("当前总费用为：" + moviesum[4]);
											break;
										}
									} while (flag31);
								}
							} while (flag31);

						} while (flag31);
						break;
					case 0:
						break;
					default: {
						System.out.println("请输入正确的影片编号");
						break;
					}

					}
					if (num3 == 0) {
						flag3 = false;
					}
				} while (flag3);
				break;
			case 0:
				flag = false;
				System.out.println("~~~~~~欢迎下次光临，再见~~~~~~");
				break;
			default:
				System.out.println("输入的编号不正确，请重新输入");
				break;
			}
		} while (flag == true);
	}

}

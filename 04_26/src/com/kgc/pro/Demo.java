package com.kgc.pro;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		boolean flag = true; // ����ѭ�����
		String[] movie = { "�����ӳ�", "ʥ��ս��", "С����", "�����ս", "�����ع�" }; // ��Ӱ��Ϣ����
		int[] moviesum = new int[5]; // ��ӰƱ����
		int[] moviepoint = new int[5]; // ��Ӱϲ��������
		do {
			System.out.println("**********��ӭ����ӰԺ��Ʊϵͳ**********");
			System.out.println("**	    1.�鿴Ԥ����		**");
			System.out.println("** 	    2.����������		**");
			System.out.println("**	    3.��Ʊ		**");
			System.out.println("**	    0.�˳���Ʊϵͳ		**");
			System.out.println("**********************************");
			System.out.println("�����빦�ܱ�ţ�");
			Scanner input = new Scanner(System.in); // ����
			int n = input.nextInt();
			switch (n) {
			case 1:
				boolean flag1 = true;
				do {
					System.out.println("~~~~~~~~~~��ӭ�鿴Ԥ����~~~~~~~~~~");
					for (int i = 0; i < movie.length; i++) {
						System.out.println("~~" + "\t    " + (i + 1) + "." + movie[i] + "\t     " + "~~");
					}
					System.out.println("~~" + "\t    " + "0.������һ��" + "\t     " + "~~");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("�������Ӱ��ţ�");
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
						System.out.println("��������ȷ��ӰƬ���");
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
					System.out.println("������Ե�" + (i + 1) + "����Ӱ��" + movie[i] + "������Ȥ��������");
					moviepoint[i] = input.nextInt();
					sum += moviepoint[i];
				}
				for (int i = 0; i < moviepoint.length; i++) {
					System.out
							.println("��" + (i + 1) + "����Ӱ��" + movie[i] + "�����������ǣ�" + (moviepoint[i] / sum) * 100 + "%");

				}
				break;

			case 3:
				boolean flag3 = true;
				boolean flag31 = true;
				int psum = 0;
				do {
					System.out.println("~~~~~~~~~~��ѡ����ϲ���ĵ�Ӱ~~~~~~~~~~");
					for (int i = 0; i < movie.length; i++) {
						System.out.println("~~" + "\t    " + (i + 1) + "." + movie[i] + "\t     " + "~~");
					}
					System.out.println("~~" + "\t    " + "0.������һ�� " + "\t     " + "~~");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("��������ϲ���ĵ�Ӱ��ţ�");
					int num3 = input.nextInt();
					switch (num3) {
					case 1:
						System.out.println("��ѡ��ĵ�Ӱ�ǣ�" + movie[0]);
						do {
							System.out.println("�����빺Ʊ������0�˳����ι��򣩣�");
							int innum = input.nextInt();
							do {
								if (innum == 0) {
									System.out.println("�Ƿ��������������ӰƱ��(1:��������0�����ٹ��򣩣�");
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
									System.out.println("ȷ�Ͻ��㣨1��ȷ�ϣ�0����������");
									int innum1 = input.nextInt();
									do {
										if (innum1 == 0) {
											flag31 = false;
										} else {
											System.out.println("��ǰ�ܷ���Ϊ��" + moviesum[0]);
											break;
										}
									} while (flag31);
								}
							} while (flag31);

						} while (flag31);
						break;
					case 2:
						System.out.println("��ѡ��ĵ�Ӱ�ǣ�" + movie[1]);
						do {
							System.out.println("�����빺Ʊ������0�˳����ι��򣩣�");
							int innum = input.nextInt();
							do {
								if (innum == 0) {
									System.out.println("�Ƿ��������������ӰƱ��(1:��������0�����ٹ��򣩣�");
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
									System.out.println("ȷ�Ͻ��㣨1��ȷ�ϣ�0����������");
									int innum1 = input.nextInt();
									do {
										if (innum1 == 0) {
											flag31 = false;
										} else {
											System.out.println("��ǰ�ܷ���Ϊ��" + moviesum[1]);
											break;
										}
									} while (flag31);
								}
							} while (flag31);

						} while (flag31);
						break;

					case 3:
						System.out.println("��ѡ��ĵ�Ӱ�ǣ�" + movie[2]);
						do {
							System.out.println("�����빺Ʊ������0�˳����ι��򣩣�");
							int innum = input.nextInt();
							do {
								if (innum == 0) {
									System.out.println("�Ƿ��������������ӰƱ��(1:��������0�����ٹ��򣩣�");
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
									System.out.println("ȷ�Ͻ��㣨1��ȷ�ϣ�0����������");
									int innum1 = input.nextInt();
									do {
										if (innum1 == 0) {
											flag31 = false;
										} else {
											System.out.println("��ǰ�ܷ���Ϊ��" + moviesum[2]);
											break;
										}
									} while (flag31);
								}
							} while (flag31);

						} while (flag31);
						break;

					case 4:
						System.out.println("��ѡ��ĵ�Ӱ�ǣ�" + movie[3]);
						do {
							System.out.println("�����빺Ʊ������0�˳����ι��򣩣�");
							int innum = input.nextInt();
							do {
								if (innum == 0) {
									System.out.println("�Ƿ��������������ӰƱ��(1:��������0�����ٹ��򣩣�");
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
									System.out.println("ȷ�Ͻ��㣨1��ȷ�ϣ�0����������");
									int innum1 = input.nextInt();
									do {
										if (innum1 == 0) {
											flag31 = false;
										} else {
											System.out.println("��ǰ�ܷ���Ϊ��" + moviesum[3]);
											break;
										}
									} while (flag31);
								}
							} while (flag31);

						} while (flag31);
						break;

					case 5:
						System.out.println("��ѡ��ĵ�Ӱ�ǣ�" + movie[4]);
						do {
							System.out.println("�����빺Ʊ������0�˳����ι��򣩣�");
							int innum = input.nextInt();
							do {
								if (innum == 0) {
									System.out.println("�Ƿ��������������ӰƱ��(1:��������0�����ٹ��򣩣�");
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
									System.out.println("ȷ�Ͻ��㣨1��ȷ�ϣ�0����������");
									int innum1 = input.nextInt();
									do {
										if (innum1 == 0) {
											flag31 = false;
										} else {
											System.out.println("��ǰ�ܷ���Ϊ��" + moviesum[4]);
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
						System.out.println("��������ȷ��ӰƬ���");
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
				System.out.println("~~~~~~��ӭ�´ι��٣��ټ�~~~~~~");
				break;
			default:
				System.out.println("����ı�Ų���ȷ������������");
				break;
			}
		} while (flag == true);
	}

}

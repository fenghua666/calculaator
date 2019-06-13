package calculator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 从键盘接受数据
		// nextLine方式接受字符串
		System.out.println("nextLine方式接收：");
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		System.out.println("欢迎使用天算牌运算器，本运算器对计算结果不赋值，请慎重使用");
		do {

			System.out.println("请输入数据1：");
			// 判断是否还有输入

			if (scan.hasNextInt()) {
				a = scan.nextInt();
				System.out.println("输入的数据为：" + a);
			}
			do {

				System.out.println("请输入数据2：");
				if (scan.hasNextInt()) {
					b = scan.nextInt();
					System.out.println("输入的数据为：" + b);
				}else {
					return ;
				}
				do {
					System.out.println("1.+");
					System.out.println("选择你要进行的运算：");
					System.out.println("2.-");
					System.out.println("3.*");
					System.out.println("4./");
					if (scan.hasNextInt()) {
						c = scan.nextInt();
						System.out.println("输入的数据为：" + c);
					}else {
						return;
					}
				} while (c < 1 || c > 4);
			} while (c == 4 && b == 0);
			switch (c) {
			case 1:
				System.out.println("你的计算结果是：" + a + "+" + b + "=" + (a + b));
				break;
			case 2:
				System.out.println("你的计算结果是：" + a + "-" + b + "=" + (a - b));
				break;
			case 3:
				System.out.println("你的计算结果是：" + a + "*" + b + "=" + (a * b));
				break;
			case 4:
				System.out.println("你的计算结果是：" + a + "/" + b + "=" + (a / b));
				break;
			}
			System.out.println("选择退出，请输入1");
			System.out.println("选择继续，请输入2");
			if (scan.hasNextInt()) {
				d = scan.nextInt();
				System.out.println("输入的数据为：" + d);
			}else {
				return;
			}
		} while (d == 2);
		System.out.println("谢谢使用，下次再见!");
		scan.close();

	}
}

package com.eoe.BasicLearn.day05;

import java.util.Random;
import java.util.Scanner;

public class For05 {

	/**
	 * @param args电脑随机产生一个0到100内的数
	 *            由人来猜
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int guessed = rand.nextInt(101);
		int guess = 0;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("开始猜吧：");
			guess = scanner.nextInt();
			if (guess < guessed) {
				System.out.println("猜小了！");
			} else if (guess > guessed) {
				System.out.println("猜大了！");
			}
			count++;
		} while (guess != guessed);
		if (count == 1) {
			System.out.println("你是神仙吧！这么准呀！");
		} else if (count == 2) {
			System.out.println("你真牛逼呀，这么会猜呀！");
		} else if (count >= 3 && count <= 8) {
			System.out.println("你很懂得猜数");
		} else
			System.out.println("我有点怀疑你的智商问题");
	}
}

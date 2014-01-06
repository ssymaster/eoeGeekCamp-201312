package com.eoe.BasicLearn.day05;

import java.util.Random;

public class For04 {

	/**
	 * @param args随机产生10个在60到100的分数
	 *            ，并找出最高分
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int score;
		int max = 1;
		for (int i = 1; i <= 10; i++) {
			score = rand.nextInt(41) + 60;
			System.out.println(score);
			if (max < score) {
				max = score;
			}
		}
		System.out.println();
		System.out.println("这个最高分是：" + max);

	}

}

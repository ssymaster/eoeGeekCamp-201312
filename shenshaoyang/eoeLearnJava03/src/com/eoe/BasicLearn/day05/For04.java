package com.eoe.BasicLearn.day05;

import java.util.Random;

public class For04 {

	/**
	 * @param args�������10����60��100�ķ���
	 *            �����ҳ���߷�
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
		System.out.println("�����߷��ǣ�" + max);

	}

}

package com.eoe.basicLearn.java;

import java.util.Arrays;
import java.util.Random;

public class Test01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int[] scores = new int[10];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = random.nextInt(41) + 60;
			System.out.print(scores[i] + " ");
		}
		// 将最高分交换到scores[0]
		for (int i = 1; i < scores.length-1; i++) {
			for (int j = 0; j < scores.length; j++) {

				if (scores[j] < scores[i]) {
					// 交换scores[0]和scores[i]
					int temp = scores[j];
					scores[j] = scores[i];
					scores[i] = temp;
				}
			}
			// if (scores[1] < scores[i - 1]) {
			// int temp = scores[1];
			// scores[1] = scores[i - 1];
			// scores[i - 1] = temp;
			// }
			break;
		}
		// int i=1;

		System.out.println();
		System.out.println(Arrays.toString(scores));

	}

}

package com.eoe.BasicLearn.day05;

public class For06 {

	/**
	 * @param args求0到10000的水仙花數
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10000; i++) {
			int g = i % 10;
			int s = i / 10 % 10;
			int b = i / 100 % 10;
			int q = i / 1000 % 10;
			int w = i / 10000;
			if (i == g * g * g + s * s * s + b * b * b + q * q * q + w * w * w) {
				System.out.println(i);
			}
		}
	}

}

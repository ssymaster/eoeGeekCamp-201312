package com.eoe.BasicLearn.day05;

import java.util.Scanner;

public class For03 {

	/**
	 * @param args判断一个数是不是质数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个大于1的自然数");
		int n = scanner.nextInt();
//	   int k =(int)Math.sqrt(n);
		boolean isPrime = true;

		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime = true) {
	System.out.println(n+"这个数是质数");
		} else {
			System.out.println(n+"这个数不是质数");
		}

	}

}

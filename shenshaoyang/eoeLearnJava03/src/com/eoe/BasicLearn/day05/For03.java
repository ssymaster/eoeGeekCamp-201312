package com.eoe.BasicLearn.day05;

import java.util.Scanner;

public class For03 {

	/**
	 * @param args�ж�һ�����ǲ�������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ������1����Ȼ��");
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
	System.out.println(n+"�����������");
		} else {
			System.out.println(n+"�������������");
		}

	}

}

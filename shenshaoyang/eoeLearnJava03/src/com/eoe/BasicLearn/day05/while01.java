package com.eoe.BasicLearn.day05;

import java.util.Scanner;

public class while01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int i=1; while(i<=20){ System.out.println("�Ͽγٵ��������Գ�"+i+"��");
		 * 
		 * }
		 */
		// int a=65;
		// while(a<=90){
		// System.out.println((char)a+":"+a);
		// a++;
		// }
		//
		Scanner scanner = new Scanner(System.in);
		System.out.println("����һ������");
		int n = scanner.nextInt();
		int result = 0;

		for (int i = 1; i <= n; i++) {
			result += i;
		}
		System.out.println("��n=" + result);
	}

}

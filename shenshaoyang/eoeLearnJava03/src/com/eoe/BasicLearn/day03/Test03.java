package com.eoe.BasicLearn.day03;

import java.util.Scanner;

public class Test03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		 System.out.println("����5���Ƶķ���");
		 int score=scanner.nextInt();
		 switch (score) {
		case 5:
			System.out.println("����");
			break;
		case 4:
			System.out.println("����");
			break;
		case 3:
			System.out.println("����");
			break;
		case 2:
		case 1:
		case 0:
			System.out.println("������");
			break;
		default:
			System.out.println("����Ĳ���5���Ƶķ���");
			break;
	}
	}

}
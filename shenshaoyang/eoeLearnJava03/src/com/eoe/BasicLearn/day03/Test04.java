package com.eoe.BasicLearn.day03;
import java.util.Scanner;

public class Test04 {

	/**
	 * @param args��������java��android��oracle���Ʒ������ҳ�������߷֡�
	 * �ⷨ2-ѡ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("java android oracle:");
		int java=scanner.nextInt();
		int android=scanner.nextInt();
		int oracle=scanner.nextInt();
		int max=java;
		if(max<android){
			max=android;
		}
		if(max<oracle){
			max=oracle;
		}
		System.out.println("��߷�"+max);
	}

}

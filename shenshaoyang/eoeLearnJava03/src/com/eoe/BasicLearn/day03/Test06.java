package com.eoe.BasicLearn.day03;
import java.util.Scanner;
public class Test06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入两个逻辑值(true或false");
		boolean a=scanner.nextBoolean();
		boolean b=scanner.nextBoolean();
		System.out.println("a="+a+"\tb="+b);
		a=a!=b?!(b=a):a;
		System.out.println("a="+a+"\tb="+b);
	}

}

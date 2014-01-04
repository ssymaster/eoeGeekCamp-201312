package com.eoe.BasicLearn.day04;

import java.util.Scanner;

public class Test04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scanner=new Scanner(System.in);
     System.out.println("输入两个值：");
     int a=scanner.nextInt();
     int b=scanner.nextInt();
     System.out.println("a="+a+"\t"+"b="+b);
     //int c;
    // c=a;a=b;b=c;
     a=a+b;
     b=a-b;
     a=a-b;
     System.out.println("a="+a+"\t"+"b="+b);
     
	}

}

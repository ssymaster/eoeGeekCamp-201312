package com.eoe.BasicLearn.day04;

import java.util.Scanner;

public class Test06 {
	static  String name;
	   static char sex;
	   static int age;
	   static double height;
	   static String type;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
      feeling("���������","��������.....");
      input();
      say();
      
      feeling("���ҵ���н��k�Ĺ�������","����������...");
      input();
      say();
	}
	static void input(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("������");
		name=scanner.next();
		System.out.println("�Ա�");
		sex=scanner.next().charAt(0);
		System.out.println("���䣺");
		age=scanner.nextInt();
		System.out.println("��ߣ�");
		height=scanner.nextDouble();
		System.out.println("�Ը�");
		type=scanner.next();
}
	static void say(){
		System.out.println("�ˣ���Һã��ҽ�"+name+"���ҽ���"+age+"�꣬���"
	    		   +height+"�ף���һλ�Ը�"+type+"��"+sex+"ʿ��");
	}
	static void feeling(String cause,String content  ){
		System.out.println(cause);
		System.out.println(content);
	}
}


package com.eoe.BasicLearn.day04;

import java.util.Scanner;

public class Test03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scanner=new Scanner(System.in);
   System.out.println("������");
   String name=scanner.next();
   System.out.println("�Ա�");
   char sex=scanner.next().charAt(0);
   System.out.println("���䣺");
   int age=scanner.nextInt();
   System.out.println("��ߣ�");
   double height=scanner.nextDouble();
   System.out.println("�Ը�");
   String type=scanner.next();
   System.out.println("�ˣ���Һã��ҽ�"+name+"���ҽ���"+age+"�꣬���"
   +height+"�ף���һλ�Ը�"+type+"��"+sex+"ʿ��");
		   }

}

package com.eoe.BasicLearn.day03;
import java.util.Scanner;
public class Test02 {
	static String name;
	static char sex;
	static int age;
	static double height;
	static String type;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		System.out.print("�ˣ���Һã�������"+name);
		System.out.print(",���꣺"+age+"��");
		System.out.print(",��ߣ�"+height+"��,");
		System.out.println("����һ��"+type+"��"+sex+"��");	
		System.out.println("��ʧ������������...");
	}

}

package com.eoe.BasicLearn.day03;
import java.util.Scanner;
public class Test07 {

	/**
	 * ������ϰ��
	 * 	  1�������ҽ��ܵĴ���鶨��Ϊ������
	 *    2����main�����е��ø÷�����
	 */
	//���¶����徲̬����
	static String name;//����
	static char sex;//�Ա�
	static int age;//����
	static double height;//���
	static String type;//�Ը�
	public static void main(String[] args) {
		input();//��һ�ε���input()Ϊ��һ������������
		say();//��һ�ε���say()�����ҽ���
		cry();//����һ���˵ĸ��飺��
		input();//�ڶ��ε���input()Ϊ��һ������������
		say();//�ڶ��ε���say()�����ҽ���
		laungh();//���ڶ����˵ĸ��飺Ц
	}
	//����say������ʾ�����ҽ���
	private static void say() {		
		System.out.print("�ˣ���Һã�������"+name);
		System.out.print(",���꣺"+age+"��");
		System.out.print(",��ߣ�"+height+"��,");
		System.out.println("����һ��"+type+"��"+sex+"��");
	}
	//����input���������ڸ�name,sex,age,height��type��������
	static void input() {
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
	//���޵ĸ���
	static void cry(){
		System.out.println("��ʧ������������...");
	}
	//���Ц�ĸ���
	static void laungh(){
		System.out.println("���������������������...");
	}
}
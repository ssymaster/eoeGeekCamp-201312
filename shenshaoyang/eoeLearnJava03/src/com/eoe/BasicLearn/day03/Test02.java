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
		System.out.println("姓名：");
		name=scanner.next();
		System.out.println("性别：");
		sex=scanner.next().charAt(0);
		System.out.println("年龄：");
		age=scanner.nextInt();
		System.out.println("身高：");
		height=scanner.nextDouble();
		System.out.println("性格：");
		type=scanner.next();
		System.out.print("嗨，大家好！，俺叫"+name);
		System.out.print(",今年："+age+"岁");
		System.out.print(",身高："+height+"米,");
		System.out.println("俺是一个"+type+"的"+sex+"生");	
		System.out.println("俺失恋啦！，呜呜...");
	}

}

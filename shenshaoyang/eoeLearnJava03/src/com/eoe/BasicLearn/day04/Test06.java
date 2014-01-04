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
      
      feeling("我想家你了","呜呜呜呜.....");
      input();
      say();
      
      feeling("我找到月薪八k的工作啦！","哈哈哈哈哈...");
      input();
      say();
	}
	static void input(){
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
}
	static void say(){
		System.out.println("嗨，大家好，我叫"+name+"，我今年"+age+"岁，身高"
	    		   +height+"米，是一位性格"+type+"的"+sex+"士。");
	}
	static void feeling(String cause,String content  ){
		System.out.println(cause);
		System.out.println(content);
	}
}


package com.eoe.BasicLearn.day04;

import java.util.Scanner;

public class Test03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scanner=new Scanner(System.in);
   System.out.println("姓名：");
   String name=scanner.next();
   System.out.println("性别：");
   char sex=scanner.next().charAt(0);
   System.out.println("年龄：");
   int age=scanner.nextInt();
   System.out.println("身高：");
   double height=scanner.nextDouble();
   System.out.println("性格：");
   String type=scanner.next();
   System.out.println("嗨，大家好，我叫"+name+"，我今年"+age+"岁，身高"
   +height+"米，是一位性格"+type+"的"+sex+"士。");
		   }

}

package com.eoe.BasicLearn.day04;

import java.util.Scanner;

public class Test05 {
   static  String name;
   static char sex;
   static int age;
   static double height;
   static String type;
 public static void main(String[] args) {
		// TODO Auto-generated method stub
      input();
      System.out.println("嗨，大家好，我叫"+name+"，我今年"+age+"岁，身高"
    		   +height+"米，是一位性格"+type+"的"+sex+"士。");
      input();
      System.out.println("嗨，大家好，我叫"+name+"，我今年"+age+"岁，身高"
    		   +height+"米，是一位性格"+type+"的"+sex+"士。");
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
}

package com.eoe.BasicLearn.day04;

import java.util.Scanner;

public class Test08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        @SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
         System.out.println("输入一个百分制分数：");
         int score=scanner.nextInt();
         if(score>=60){
        	 System.out.println("及格");
        	 }
        	 else if(score<60&&score>=0){
        		 System.out.println("不及格");
        		 }
        		 else {
        			 System.out.println("输入的不是一个百分制分数");
        		 }
        	 
         }
}

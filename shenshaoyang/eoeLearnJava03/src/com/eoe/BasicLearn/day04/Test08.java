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
         System.out.println("����һ���ٷ��Ʒ�����");
         int score=scanner.nextInt();
         if(score>=60){
        	 System.out.println("����");
        	 }
        	 else if(score<60&&score>=0){
        		 System.out.println("������");
        		 }
        		 else {
        			 System.out.println("����Ĳ���һ���ٷ��Ʒ���");
        		 }
        	 
         }
}

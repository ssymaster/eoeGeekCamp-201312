package com.eoe.BasicLearn.day03;
import java.util.Scanner;
public class Test05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("�������");
		int year=scanner.nextInt();
		if(year%400==0 || year%4==0&&year%100!=0){
			System.out.println("����");
		}else{
			System.out.println("ƽ��");
	 }
	}
}

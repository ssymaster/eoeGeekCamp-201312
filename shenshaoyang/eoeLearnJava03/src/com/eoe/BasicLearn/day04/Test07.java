package com.eoe.BasicLearn.day04;

import java.util.Scanner;

public class Test07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double d=jisuan(2,3.25);
        System.out.println("d="+d);
        Scanner f=new Scanner(System.in);
        System.out.println("����һ��������");
        String name=f.next();
        switch (name) {
		case "������  ":
			System.out.println("Ŭ����");
			break;
		case "�ž�":
			System.out.println("������");
			break;
		case "�ŷ�":
			System.out.println("�����");
			break;
		/*case 3:
			System.out.println("����");
		case 2:
		case 1:
		case 0:
			System.out.println("������");*/
		default:
			System.out.println("����Ĳ���һ��������");
			break;
		}
        
    }
	static  double jisuan(int a,double b){
		double c=Math.pow(12, b);
		double d=(a+b)*c;
		return d;
	}

}

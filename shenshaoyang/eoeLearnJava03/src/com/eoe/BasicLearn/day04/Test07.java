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
        System.out.println("输入一个人名：");
        String name=f.next();
        switch (name) {
		case "沈少阳  ":
			System.out.println("努力的");
			break;
		case "张静":
			System.out.println("善良的");
			break;
		case "张飞":
			System.out.println("暴躁的");
			break;
		/*case 3:
			System.out.println("及格");
		case 2:
		case 1:
		case 0:
			System.out.println("不及格");*/
		default:
			System.out.println("输入的不是一个人名！");
			break;
		}
        
    }
	static  double jisuan(int a,double b){
		double c=Math.pow(12, b);
		double d=(a+b)*c;
		return d;
	}

}

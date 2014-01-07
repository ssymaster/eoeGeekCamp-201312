package com.eoe.basicLearn.java;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
   数组高效复制
   System.arraycopy()
   dest=Arrays.copyOf(src,length);
   统计指定字符在字符串中出现的所有位置
 */
public class Test02 {
	
	public static void main(String[] args) {
		String[] names={"张飞","王菲","刘亦飞","吗啡"};
		Scanner scanner=new Scanner(System.in);   
		int index;//保存插入的位置
		do{
			System.out.println("输入删除的位置(1-5)");
			index=scanner.nextInt();
		}while(index<1 || index>5);
		String name="咖啡";
		//步骤1、names数组扩容
		names=Arrays.copyOf(names, names.length-1);
		//将index-1~names.lenght-1的元素后移
		for(int i=names.length-1;i>=index;i--){
			names[i-1]=names[i];
		}
		names[index-1]=name;
		System.out.println(Arrays.toString(names));
	}
}


package com.eoe.basicLearn.java;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
   �����Ч����
   System.arraycopy()
   dest=Arrays.copyOf(src,length);
   ͳ��ָ���ַ����ַ����г��ֵ�����λ��
 */
public class Test02 {
	
	public static void main(String[] args) {
		String[] names={"�ŷ�","����","�����","���"};
		Scanner scanner=new Scanner(System.in);   
		int index;//��������λ��
		do{
			System.out.println("����ɾ����λ��(1-5)");
			index=scanner.nextInt();
		}while(index<1 || index>5);
		String name="����";
		//����1��names��������
		names=Arrays.copyOf(names, names.length-1);
		//��index-1~names.lenght-1��Ԫ�غ���
		for(int i=names.length-1;i>=index;i--){
			names[i-1]=names[i];
		}
		names[index-1]=name;
		System.out.println(Arrays.toString(names));
	}
}


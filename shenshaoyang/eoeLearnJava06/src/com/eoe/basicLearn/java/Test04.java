package com.eoe.basicLearn.java;

import java.util.Arrays;
import java.util.Scanner;

public class Test04 {

	/**
	 * @param args—°‘Ò≈≈–Ú
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	
	int[] a={32,49,38,65,97};
	System.out.println(Arrays.toString(a));
	for(int j=0;j<a.length;j++){
	for(int i=j+1;i<a.length;i++){
		if(a[j]<a[i]){
			swap(a,j,i);
		}
	}
	}
	System.out.println(Arrays.toString(a));
}

	private static void swap(int[] a, int j, int i) {
		// TODO Auto-generated method stub
		
	}

	
	}

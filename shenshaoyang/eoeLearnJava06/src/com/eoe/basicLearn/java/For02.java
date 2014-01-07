package com.eoe.basicLearn.java;

import java.util.Scanner;

public class For02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("ÊäÈëÒ»¸ö×Ö·û´®");
		String s = scanner.next();
		s = s.trim();
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.substring(i));

		}

	}

}

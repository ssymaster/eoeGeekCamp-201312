package com.eoe.BasicLearn.day05;

import java.util.Random;
import java.util.Scanner;

public class For05 {

	/**
	 * @param args�����������һ��0��100�ڵ���
	 *            ��������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int guessed = rand.nextInt(101);
		int guess = 0;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("��ʼ�°ɣ�");
			guess = scanner.nextInt();
			if (guess < guessed) {
				System.out.println("��С�ˣ�");
			} else if (guess > guessed) {
				System.out.println("�´��ˣ�");
			}
			count++;
		} while (guess != guessed);
		if (count == 1) {
			System.out.println("�������ɰɣ���ô׼ѽ��");
		} else if (count == 2) {
			System.out.println("����ţ��ѽ����ô���ѽ��");
		} else if (count >= 3 && count <= 8) {
			System.out.println("��ܶ��ò���");
		} else
			System.out.println("���е㻳�������������");
	}
}

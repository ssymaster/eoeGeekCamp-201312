package com.eoe.basicLearn.java;

import java.util.Arrays;

public class Test03 {
	/**
	 * ��д����swap��������������ֵ�����Ը÷����Ľ������ �ܷ�Ӱ����ô��ı�����
	 */
	public static void main(String[] args) {
		int[] a = { 50, 40, 30, 20, 10 };
		// ��ӡswap()����ǰ�����ֵ
		System.out.println("swap()����ǰ������a��ֵ" + Arrays.toString(a));
		swap(a, 0, 1);// ������a�ĵ�ַ����������Ԫ�ص��±괫�ݸ�swap()
		// ��ӡswap()���ú������ֵ
		System.out.println("swap()���ú�����a��ֵ" + Arrays.toString(a));
	}

	// swap()������������ֵ��������Ϊ������ͬʱ��������Ԫ�ص��±�
	static void swap(int b[], int i, int j) {
		// ����b[i]��b[j]��ֵ
		int c = b[i];
		b[i] = b[j];
		b[j] = c;
	}
}

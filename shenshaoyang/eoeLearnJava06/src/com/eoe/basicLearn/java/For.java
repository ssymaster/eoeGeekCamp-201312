package com.eoe.basicLearn.java;

public class For {

	/**
	 * @param args�����
	 *            (��5+��10)*(��8+��4)/(pow(2,8)-5!)+4!-pow(3,4)
	 */
	public static void main(String[] args) {
		// TOAuto-generated method stub
		double result = (add(10) + add(10)) * (add(8) + add(4))
				/ (pow(2, 8) - fact(5) + fact(4) - pow(3, 4));
		System.out.println("(��5+��10)*(��8+��4)/(pow(2,8)-5!)+4!-pow(3,4)="
				+ result);
		System.out.println(round(result, 3));
	}

	// ���㦲n
	static int add(int n) {
		int t = 0;
		for (int i = 1; i <= n; i++) {
			t = t + i;
		}
		return t;
	}

	// ����n!
	static double fact(int n) {
		double t = 0;
		for (int i = 1; i <= n; i++) {
			t = t * i;
		}
		return t;
	}

	// ����m��n�η�
	static double pow(int m, int n) {
		double t = 1;
		for (int i = 1; i <= n; i++) {
			t = t * m;
		}
		return t;
	}

	// ����С�����ָ��λ��
	static double round(double x, int n) {
		return Math.round(Math.pow(10, n) * x) * 1.0 / Math.pow(10, n);
	}
}

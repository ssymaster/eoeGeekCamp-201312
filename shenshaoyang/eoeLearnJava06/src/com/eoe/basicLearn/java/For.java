package com.eoe.basicLearn.java;

public class For {

	/**
	 * @param args计算机
	 *            (Σ5+Σ10)*(Σ8+Σ4)/(pow(2,8)-5!)+4!-pow(3,4)
	 */
	public static void main(String[] args) {
		// TOAuto-generated method stub
		double result = (add(10) + add(10)) * (add(8) + add(4))
				/ (pow(2, 8) - fact(5) + fact(4) - pow(3, 4));
		System.out.println("(Σ5+Σ10)*(Σ8+Σ4)/(pow(2,8)-5!)+4!-pow(3,4)="
				+ result);
		System.out.println(round(result, 3));
	}

	// 计算Σn
	static int add(int n) {
		int t = 0;
		for (int i = 1; i <= n; i++) {
			t = t + i;
		}
		return t;
	}

	// 计算n!
	static double fact(int n) {
		double t = 0;
		for (int i = 1; i <= n; i++) {
			t = t * i;
		}
		return t;
	}

	// 计算m的n次方
	static double pow(int m, int n) {
		double t = 1;
		for (int i = 1; i <= n; i++) {
			t = t * m;
		}
		return t;
	}

	// 保留小数点的指定位数
	static double round(double x, int n) {
		return Math.round(Math.pow(10, n) * x) * 1.0 / Math.pow(10, n);
	}
}

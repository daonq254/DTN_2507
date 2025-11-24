package com.vti.backend;

public class Math {
//	Tính tổng 2 số nguyên
	public int sum(int a, int b) {
		int resutlSum = a + b + 2;

		return resutlSum;
	}
//	

	public int minus(int a, int b) {
		return a - b;
	}

//	Tính tổng 2 số thực
	public float sum(float a, float b) {
		return a + b;
	}

//	Tính tổng 2 số thực
	public double sum(double a, double b) {
		return a + b;
	}

	public double sum(int a, double b, int c) {
		return a + b + c;
	}

//	Overload: Nạp chồng
}

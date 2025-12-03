package com.vti.backend;

public class MathManagement {
	static int a = 10;
	static int b = 20;

	public static void sum() {

		int resutl = a + b;
		System.out.println("Tính tổng 2 số, kết quả: " + resutl);
	}

	public void minus() {
		System.out.println("Tính hiệu 2 số");
		int result_minus = a - b;
	}

// Tính phép chia 2 số
	public float divice(int a, int b) throws Exception {
		try {
			System.out.println("Phép chia 2 số");

			float result = a / b; // Exception
			return result;
		} catch (Exception e) {
			throw new Exception(); // Bắn ra bên ngoài 1 exception
		}

	}
}

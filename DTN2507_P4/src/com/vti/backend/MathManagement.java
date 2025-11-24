package com.vti.backend;

public class MathManagement {

// Tính phép chia 2 số
	public float divice(int a, int b) throws Exception {
		try {
			float result = a / b; // Exception
			return result;
		} catch (Exception e) {
			throw new Exception(); // Bắn ra bên ngoài 1 exception
		}

	}
}

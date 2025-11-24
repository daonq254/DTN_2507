package com.vti.frontend;

import java.util.Scanner;

import com.vti.backend.Math;

public class Demo2 {
	public static void main(String[] args) {
		Math math = new Math();
//		math.sumInt(10, 20);
//		math.sumfloat(1.4f, 1.2f);
//		math.sumDouble(10.2, 10.3);

//		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào số thứ 1");
		int a = scanner.nextInt();
//		System.out.println(a);
		System.out.println("Mời bạn nhập vào số thứ 2");
		int b = scanner.nextInt();

		System.out.println("Mời bạn Chọn phép tính: + - * /");
		String choose = scanner.next();
		int resutl = 0;

		switch (choose) {
		case "+": {
			resutl = math.sum(a, b);
			System.out.println("Result: " + resutl);

			break;
		}
		case "-": {
			resutl = math.minus(a, b);
			System.out.println("Result: " + resutl);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choose);
		}

		math.sum(10, 20);
		math.sum(1.4f, 1.6f);
	}
}

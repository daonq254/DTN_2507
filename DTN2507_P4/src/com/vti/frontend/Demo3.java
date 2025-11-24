package com.vti.frontend;

import java.util.Scanner;

import com.vti.backend.MathManagement;

public class Demo3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MathManagement mathManagement = new MathManagement();
		System.out.println("Nhập số 1: ");
		int a = scanner.nextInt();

		System.out.println("Nhập số 2: ");
		int b = scanner.nextInt();

		try {
			System.out.println("Kết quả: " + mathManagement.divice(a, b));
		} catch (Exception e) {
			e.printStackTrace();
		}

//		try {
//			System.out.println("Kết quả: " + mathManagement.divice(a, b));
//		} catch (Exception e) {
//			System.out.println("Dữ liệu không hợp lệ");
//			System.out.println("Dữ liệu không hợp lệ");
//			System.out.println("Dữ liệu không hợp lệ");
//			System.out.println("Dữ liệu không hợp lệ");
//			System.out.println("Dữ liệu không hợp lệ");
//			System.out.println("Dữ liệu không hợp lệ");
//			System.out.println("Dữ liệu không hợp lệ");
//		}

	}
}

package com.vti.utils;

import java.util.Scanner;

public class ScannerUtils {
// Xây dựng 1 phương thức hỗ trợ cho việc nhập số nguyên
//	Người dùng nhập liệu, nhập số nguyên
//	Nếu k nhập đúng số nguyên, thì yêu cầu nhập lại
	private static Scanner scanner = new Scanner(System.in);

	public static int inputInt(String mes) {
//		
		while (true) {
			try {
//				String inputData = scanner.next().trim(); // Nhập gì cũng được 2, hai
//				Chuyển đổi chuỗi ==> số nguyên ? đúng : sai  ==> Exception
//				int outputData = Integer.parseInt(scanner.next().trim());

				return Integer.parseInt(scanner.next().trim());
			} catch (Exception e) {
				System.err.println(mes);
			}
		}

	}

}

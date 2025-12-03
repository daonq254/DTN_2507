package com.vti.frontend;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
//		
		System.out.println("Code 1");
		System.out.println("Code 2");
		System.out.println("Code 3");
		System.out.println("Code 4");

// Exception
//		ArithmeticException
//		int a = 10;
////		b =0
//		int b = 0;
//
//		System.out.println("Phép chia 2 số: " + (a / b));

//		NullPointerException
//		String name = null;
//		System.out.println("Số ký tự trong tên: " + name.length());

//		ArrayIndexOutOfBoundsException
//		String[] nameArray = new String[3]; // 0 1 2
//		nameArray[0] = "daonq";
//
//		nameArray[3] = "Hiếu";

		Scanner scanner = new Scanner(System.in);
		System.out.println("Hãy chọn chức năng");
		System.out.println("1. Chuyển đổi số");
		System.out.println("2. thực hiện phép tính");
		int choice = scanner.nextInt();
//		NumberFormatException
		try {
			switch (choice) {
			case 1: {
				String numberString = "Một"; // 123 Một Hai Ba
				int intNumber = Integer.parseInt(numberString);

			}
			case 2: {
//				Phép chia cho 0
				System.out.println("Phép chia 2 số: " + (10 / 0)); // ArithmeticException

			}
			}
//			

		} catch (NumberFormatException e) {
			System.out.println("Kiểm tra lại định dạng dữ liệu");
			e.printStackTrace();

		} catch (ArithmeticException e) {
			System.out.println("Kiểm tra lại phép toán!");
			e.printStackTrace();

		} finally {
			System.out.println("Hoàn thành chức năng 5!");
		}

//		
		System.out.println("Code 6");
		System.out.println("Code 7");
		System.out.println("Code 8");
		System.out.println("Code 9");
	}

	public static void abc() {
//

	}

	public void xyz() {
//

	}
}

package com.vti.frontend;

import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args) {
//
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Mời bạn chọn bài tập muốn xem");
			System.out.println("1. Exercise 1");
			System.out.println("2. Exercise 2");
			System.out.println("3. Exercise 3");
			System.out.println("4. Exercise 4");

			System.out.println("10. Thoát");
//	
			int choose = scanner.nextInt(); // 1 -4 -10
			switch (choose) {
			case 1:
				System.out.println("Exercise 1");
				break;
			case 2:
				System.out.println("Exercise 2");
				break;
			case 3:
				System.out.println("Exercise 3");
				break;
			case 4:
				System.out.println("Exercise 4");
				break;

			case 10:

				return;
			default:
				System.out.println("Nhập lại:");
				break;
			}
		}

	}
}

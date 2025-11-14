package com.vti.frontend;

import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) {
//		Nhập liệu từ người dùng- từ bàn phím
		Scanner scanner = new Scanner(System.in);

		System.out.println("Mời bạn nhập vào tên"); // daonq
		String name = scanner.nextLine();

		System.out.println("Mời bạn nhập vào tuổi"); // 38
		int age = scanner.nextInt();

		System.out.printf("Tên tôi là %s, năm nay %d tuổi \n", name, age);

		scanner.close();
	}
}

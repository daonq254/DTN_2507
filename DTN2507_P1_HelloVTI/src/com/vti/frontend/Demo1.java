package com.vti.frontend;

public class Demo1 {
	public static void main(String[] args) {
// Kiểm tra xem số người dùng nhập vào là số dương hay âm
		int x = 0;

// x > 0
		if (x > 0) {
			System.out.println("Số X là số dương");
		} else if (x == 0) {
			System.out.println("x bằng 0");
		} else {
			System.out.println("Số X là số âm");
		}
//		Hãy tìm số lớn nhất trong 2 số
		int a = 10;
		int b = 20;
		int max = (a > b) ? a : b;
//		if (a > b) {
//			max = a;
//		} else {
//			max = b;
//		}
//		Ternary

		System.out.println("Max: " + max);

//		Người dùng nhập vào 1 số ngẫu nhiên: 1 -7
//		1: Chủ nhật
//		2: Thứ 2
//		3: Thứ 3
//		...
		int day = 1;
//		if (day == 1) {
//			System.out.println("Chủ nhật");
//		} else if (day == 2) {
//			System.out.println("Thứ hai");
//		} else if (day == 3) {
//			System.out.println("Thứ ba");
//
//		} else if (day == 4) {
//			System.out.println("Thứ Tư");
//
//		} else if (day == 5) {
//			System.out.println("Thứ năm");
//
//		} else if (day == 6) {
//			System.out.println("Thứ sáu");
//
//		} else if (day == 7) {
//			System.out.println("Thứ bảy");
//
//		} else {
//			System.out.println("Dữ liệu bạn nhập không chính xác!!");
//		}

//		Switch Case
		switch (day) {
		case 1: {
			System.out.println("Chủ nhật");
			break;
		}
		case 2: {

			System.out.println("Thứ hai");
			break;
		}
		case 3: {

			System.out.println("Thứ ba");
			break;
		}
		case 4: {

			System.out.println("Thứ tư");
			break;
		}
		case 5: {

			System.out.println("Thứ năm");
			break;
		}
		case 6: {

			System.out.println("Thứ sáu");
			break;
		}
		case 7: {

			System.out.println("Thứ baỷ");
			break;
		}
		default:
			System.out.println("Dữ liệu bạn nhập không chính xác!!");
			break;
		}
// Vòng lặp
//		Hãy in ra các số liên tiếp từ 1 đến 100
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
//		bắt đầu: 1
//		bước nhẩy: 1
//		điểm dừng 100

		for (int i = 5; i <= 10; i = i + 1) {
//i 		1
//			2
//			3
//			4
			System.out.println(i);
		}
	}
}

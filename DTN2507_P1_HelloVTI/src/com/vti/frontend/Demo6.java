package com.vti.frontend;

public class Demo6 {
	public static void main(String[] args) {
// 		Kiểu dữ liệu
//		int float double char String bolean
		int a;
		float f = 10.5f;

		a = 10;

		Integer a1 = 10;
		System.out.println("a1:" + a1);

		Float f1 = 10.6f;
		System.out.println("f1:" + f1);

//		int Interger
//		float Float
//		Chuyển đổi primitive sang dạng wrapper class Interger ==> Boxing
		Integer a_wrapper = Integer.valueOf(a);

//		Chuyển đổi wrapper sang dạng primitive class Interger ==> UnBoxing
		float f1_primitive = f1.floatValue();

//		Datatype Casting -- Chuyển đổi kiểu dữ liệu
		int i = 10;
//		...
		double j = i;

		float k = 4.9f;
		int m = (int) k;
		System.out.println("m: " + m);

//	 Xử lý chuỗi trong java	
		String myName = "Nguyễn Quang Đạo";
		String myAge = "38";
		System.out.println("Tên của tôi là: " + myName);

	}

	public static void Q1() {
		float luong1 = 5240.5f;
		float luong2 = 10970.055f;
		int intLuong1 = (int) luong1;
		int intLuong2 = (int) luong2;
		System.out.println("Luong Account 1: " + intLuong1);
		System.out.println("Luong Account 2: " + intLuong2);
	}

}

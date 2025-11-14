package com.vti.frontend;

public class Demo3 {
//	Hàm Main
	public static void main(String[] args) {
//		Math math = new Math();
//
//		System.out.println("Tổng của 2 số là:" + math.sum(10, 20));
//		System.out.println("Tổng của 2 số là:" + math.sum(30, 50));
		int i = 10;
		int a = ++i; // i =11
		System.out.println(a); // 11
		System.out.println(i); // 11

		int b = 0;
		// b = b + 2; // 2
		b += 2;

//		
		System.out.println("--- Print --");
		System.out.println("--- Print --");

		System.out.print("--- Print --");
		System.out.print("--- Print --");
		String name = "daonq";
		int age = 38;
//		Ten tôi la daonq, tôi năm nay 38 tuổi
		System.out.printf("Tên tôi là %s, năm nay %d tuổi \n", name, age);
		System.out.printf("VTI Academy!!");
	}

//	Hàm sum
//	public static int sum(int a, int b) {
//		int result = a + b;
//		return result;
//	}

}

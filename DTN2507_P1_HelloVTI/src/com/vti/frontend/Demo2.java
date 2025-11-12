package com.vti.frontend;

public class Demo2 {
	public static void main(String[] args) {
		for (int i = 5; i < 20; i = i + 3) {
//i 		1
//		2
//		3
//		4
			System.out.println(i);

		}

//		
		System.out.println("In các phần tử trong mảng");
		int[] numbers = { 2, 5, 7, 9, 10, 4, 19, 10, 20, 20 }; // 7 numbers.length
//		System.out.println(numbers[0]);
//		System.out.println(numbers[1]);
//		System.out.println(numbers[2]);
//		System.out.println(numbers[3]);
//		System.out.println(numbers[4]);
//		System.out.println(numbers[5]);
		for (int i = 0; i <= numbers.length - 1; i++) {
			System.out.println(numbers[i]);
		}
	}
}
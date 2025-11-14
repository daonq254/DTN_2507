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
		System.out.println("--- For");
//		For
		System.out.println("In các phần tử trong mảng");
		int[] numbers = { 2, 5, 7, 9 }; // 7 numbers.length

		for (int i = 0; i <= 3; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("--- For Each");
//		For Each
		for (int num : numbers) {
			System.out.println(num);
		}

		System.out.println("--- While");
// In ra các số từ 1 đến 10
		int i = 11;
		while (i <= 10) {
			System.out.println(i); // 1
			i = i + 1;
		}

//		int[] numbers = { 2, 5, 7, 9 };  Tỉnh tổng của mảng số nguyên, sử dụng vòng lặp while
//		while (true) {
//			System.out.println("VTI");
//		}

		System.out.println("--- do While");
// In ra các số từ 1 đến 10
		int j = 11;
		do {
			System.out.println(j);
			j++; // 2
		} while (j <= 10);

		// In ra các số chẵn trong khoảng từ 0 đến 30
		int k = 0;
		do {
			if (k % 2 == 0) {
				System.out.println(k);
			}
			k++;
		} while (k <= 30);

//		Từ khóa continue
		System.out.println("--continue --");
		for (int i1 = 0; i1 <= 10; i1++) {
			if (i1 == 5) {
				break;
			}
			System.out.println(i1);
		}
//		
//		
//		int[] nums = { 1, 2, 3, 6, -7, 9, -10 };
// Hãy in ra các phần tử của mảng, nhưng khi gặp số âm thì thoát
		int[] nums2 = { 1, 2, 3, 6, -6, 9, -10 };
		for (int num : nums2) {
			if (num < 0) {
				break;
			}
			System.out.println(num);
		}

//		int[] nums = { 1, 2, 3, 6, -7, -9, -10 };
//		for (int numbers : nums) {
//			if (numbers < 0) {
//				break;
//			}
//			System.out.println(numbers);
//		}
	}
}
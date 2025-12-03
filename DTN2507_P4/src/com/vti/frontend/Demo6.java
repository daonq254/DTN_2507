package com.vti.frontend;

import com.vti.utils.ScannerUtils;

public class Demo6 {
	public static void main(String[] args) {
		System.out.println("Mời bạn nhập vào tuổi: ");
		int age = ScannerUtils.inputInt("Không phải số nguyên, nhập lại"); // 20
		System.out.println("Tuổi của bạn là: " + age);
	}
}

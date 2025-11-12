package com.vti.frontend;

import com.vti.entity.Student;

public class Program {
// Code
//	Code
//	Thuộc tính

//	Phương thức
//	Function 1

//	Function 2

//	Function 3

//	Thể hiện thông qua hàm main
	public static void main(String[] args) {
//		ctrl+ shift + F
//		ctrl + /
		System.out.println("HELLO VTI");
//		System.out.println();
//		Xây dựng chương trình tính tổng 2 số

		int a = 10;
		int b = 20;
		Gender gender = Gender.MALE;
		a = 30;

		int result = a + b;
		System.out.println("Tổng của 2 số là: " + result);

//		"Tân", "Minh", "Phúc","Hạnh"
//		String DTN2407_name1 = "Tân";
//		String DTN2407_name2 = "Minh";
//		String DTN2407_name3 = "Phúc";
//		String DTN2407_name4 = "Hạnh";
//==> Java hỗ trợ kiểu dữ liệu mảng
		String[] DTN2407_name = { "Tân", "Minh", "Phúc", "Hạnh" };
		System.out.println("Name 1:" + DTN2407_name[0]);
		System.out.println("Name 2:" + DTN2407_name[1]);
		System.out.println("Name 3:" + DTN2407_name[2]);
		System.out.println("Name 4:" + DTN2407_name[3]);

		int[] number = { 1, 2, 4, 5, };
//
		Student student1 = new Student();
		student1.id = 1;
		student1.fullname = "Nguyễn Văn Tân";
		student1.email = "TanNV@gmail.com";
		student1.learn();

		Student student2 = new Student();
		student2.id = 2;
		student2.fullname = "Trần Minh Nhật";
		student2.email = "NhatTM@gmail.com";
//		student2.gender ="Male";
		student2.learn();

		Student[] students = { student1, student2 };

//			students[0];
//			students[1]
		System.out.println("Thông tin bạn học viên số 1:");
		System.out.println("ID: " + student1.id);
		System.out.println("Fullname: " + student1.fullname);
		System.out.println("Email: " + student1.email);
		student1.learn();
	}

	public enum Gender {
		MALE, FEMALE
	}

//	
}

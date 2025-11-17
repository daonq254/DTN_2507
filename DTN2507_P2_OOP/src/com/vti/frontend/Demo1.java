package com.vti.frontend;

import com.vti.entity.Student;

public class Demo1 {
	public static void main(String[] args) {
//		Student student1 = new Student(1, "daonq@vti.com", "daonq", "NguyenDao");
//		System.out.println(student1.id);
//		System.out.println(student1.email);

		Student student1 = new Student(1, "daonq@vti.com");
		student1.username = "daonq";

		Student student2 = new Student();
	}
}

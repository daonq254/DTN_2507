package com.vti.frontend;

import java.util.LinkedList;
import java.util.List;

import com.vti.entity.Student;

public class Demo9_Linkedlist_List {
	public static void main(String[] args) {
		// Tạo ra 1 số đối tượng Student
		Student student1 = new Student(1, "Student 1");
		Student student2 = new Student(2, "Student 2");
		Student student3 = new Student(3, "Student 3");
		Student student4 = new Student(4, "Student 4");
		Student student5 = new Student(5, "Student 5");
		Student student6 = new Student(6, "Student 6");

		List<Student> studentsLinkedList = new LinkedList<Student>();
		// Thêm
		studentsLinkedList.add(student1);
		studentsLinkedList.add(student2);
		studentsLinkedList.add(student3);
		studentsLinkedList.add(student4);
		studentsLinkedList.add(student5);
		studentsLinkedList.add(student5);
		studentsLinkedList.add(student5);
		studentsLinkedList.add(student6);

//		Hiển thị
		for (Student student : studentsLinkedList) {
			System.out.println(student);
		}
		System.out.println("---------------------");
//		Lấy theo Index
		System.out.println(studentsLinkedList.get(2));

//		Đặc điểm
//		Có thể truy cập theo Index
//		Có thể trùng lặp dữ liệu
//		Thứ tự
//		==> Có nhiều điểm giống ArrayList
//		Khác nhau??

	}

}

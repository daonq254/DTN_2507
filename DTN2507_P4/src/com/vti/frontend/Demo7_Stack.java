package com.vti.frontend;

import java.util.Iterator;
import java.util.Stack;

import com.vti.entity.Student;

public class Demo7_Stack {
	public static void main(String[] args) {
// Tạo ra 1 số đối tượng Student
		Student student1 = new Student(1, "Student 1");
		Student student2 = new Student(2, "Student 2");
		Student student3 = new Student(3, "Student 3");
		Student student4 = new Student(4, "Student 4");
		Student student5 = new Student(5, "Student 5");
		Student student6 = new Student(6, "Student 6");

//		Lưu vào Stack
		Stack<Student> studentStack = new Stack<Student>();
		studentStack.push(student1);
		studentStack.push(student2);
		studentStack.push(student3);
		studentStack.push(student4);
		studentStack.push(student5);
		studentStack.push(student6);

//		Xem dữ liệu có trong stack
//		Iterator
		Iterator<Student> iterator = studentStack.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.toString());
		}
		System.out.println("-----------pop()------------");
//		pop()
		System.out.println(studentStack.pop());
		System.out.println("-----------------------");

		iterator = studentStack.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.toString());
		}

//		peek()
		System.out.println(studentStack.peek());
		iterator = studentStack.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.toString());
		}
		System.out.println(studentStack.size());
	}
}

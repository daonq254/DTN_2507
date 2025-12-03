package com.vti.frontend;

import java.util.LinkedList;
import java.util.Queue;

import com.vti.entity.Student;

public class Demo8_Queue {
	public static void main(String[] args) {
		// Tạo ra 1 số đối tượng Student
		Student student1 = new Student(1, "Student 1");
		Student student2 = new Student(2, "Student 2");
		Student student3 = new Student(3, "Student 3");
		Student student4 = new Student(4, "Student 4");
		Student student5 = new Student(5, "Student 5");
		Student student6 = new Student(6, "Student 6");
//		Tạo ra queue
		Queue<Student> studentQueue = new LinkedList<Student>();
		studentQueue.offer(student1);
		studentQueue.offer(student2);
		studentQueue.offer(student3);
		studentQueue.offer(student4);
		studentQueue.offer(student5);
		studentQueue.offer(student6);

//		peek()
		System.out.println(studentQueue.peek());
		System.out.println(studentQueue.peek());
		System.out.println(studentQueue);
		System.out.println("-------------------------");
//		poll()
		System.out.println(studentQueue.poll());
		System.out.println(studentQueue.poll());
		System.out.println(studentQueue.poll());
		System.out.println(studentQueue);
	}
}

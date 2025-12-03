package com.vti.frontend;

import java.util.HashSet;
import java.util.Set;

import com.vti.entity.Student;

public class Demo10_Hashset {
	public static void main(String[] args) {
		Student student1 = new Student(1, "Student 1");
		Student student2 = new Student(2, "Student 2");
		Student student3 = new Student(3, "Student 3");
		Student student4 = new Student(4, "Student 4");
		Student student5 = new Student(5, "Student 5");
		Student student6 = new Student(6, "Student 6");

		Set<Student> studentsHashSet = new HashSet<Student>();
		studentsHashSet.add(student1);
		studentsHashSet.add(student2);
		studentsHashSet.add(student3);
		studentsHashSet.add(student4);
		studentsHashSet.add(student5);
		studentsHashSet.add(student5);
		studentsHashSet.add(student5);
		studentsHashSet.add(student6);

		for (Student student : studentsHashSet) {
			System.out.println(student);
		}
//	Xóa phần tử trong hashset
		studentsHashSet.remove(student5);

	}
}

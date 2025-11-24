package com.vti.frontend;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoArrayList {
	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<String>();

//		Thêm dữ liệu
		students.add("Tân");
		students.add("Minh");
		students.add("Ngân");
		students.add("Việt");
		students.add("Phúc");

//		...
		students.add("Hiếu");
//		Duyệt các phần tử trong mảng
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i).toString());
		}
		System.out.println("-----------");
		for (String student : students) {
			System.out.println(student);
		}
		System.out.println("-----Iterator------");

//		Iterator
		Iterator<String> iterator = students.iterator();
		while (iterator.hasNext()) {

			String student = iterator.next();
			if (student == "Minh") {
				iterator.remove();
			}
			System.out.println(student);
		}

	}
}

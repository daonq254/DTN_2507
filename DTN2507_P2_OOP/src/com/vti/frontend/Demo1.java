package com.vti.frontend;

import com.vti.entity.Mentor;
import com.vti.entity.Trainee;

public class Demo1 {
	public static void main(String[] args) {
//		Student student1 = new Student(1, "daonq@vti.com", "daonq", "NguyenDao");
//		System.out.println(student1.id);
//		System.out.println(student1.email);

//		Student student1 = new Student(1, "daonq@vti.com");
//		student1.username = "daonq";
//		student1.setUsername("daonq");
//		student1.fullname = "Nguyễn Quang Đạo";
//		student1.setFullname("Nguyễn Quang Đạo");

//		Student student2 = new Student();
//		Hãy in ra thông tin của đối tượng student1
//		System.out.println("Student{id: " + student1.id + " ,email: " + student1.email + " ,username: "
//				+ student1.username + " ,fullname: " + student1.fullname + " }");

//		Student student2 = new Student(2, "daonq2@vti.com", "daonq2", "NguyenDao2");
//		System.out.println("Student{id: " + student2.id + " ,email: " + student2.email + " ,username: "
//				+ student2.username + " ,fullname: " + student2.fullname + " }");
//		System.out.println(student1.toString());
//		System.out.println(student2.toString());
//		System.out.println("Student1, Username: " + student1.getUsername());
//		System.out.println("Student1, Fullname: " + student1.getFullname());
		Mentor mentor1 = new Mentor();
		mentor1.setId(1);
		mentor1.setUsername("mentor1");
		mentor1.setEmail("mentor1@gmail.com");
		mentor1.setFullname("Mentor1");
		mentor1.setYearOfExperience(10);

//		mentor1.showInfo();
		mentor1.showInfoMentor();
//		mentor1.id

//		Tạo ra các Account
//		Account account1 = new Account();
//		account1.setId(1);
//		account1.setEmail("Account1@gmail");

		Trainee trainee1 = new Trainee();
		mentor1.goToVTI();
		trainee1.goToVTI();
	}
}

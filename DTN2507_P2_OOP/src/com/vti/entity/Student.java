package com.vti.entity;

public class Student {
	public int id;
	public String email;
	public String username;
	public String fullname;

	public void learn() {
		System.out.println("learn!");
	}

	public void showInfo() {
		System.out.println("ID: " + id + " Email: " + email);
		learn();
	}

// Hàm tạo không tham số
	public Student() {

	}

//
	// Hàm tạo có tham số
	public Student(int id, String email, String username, String fullname) {
		this.id = id;
		this.email = email;
		this.username = username;
		this.fullname = fullname;
	}

	public Student(int id, String email) {
		this.id = id;
		this.email = email;

	}

	public Student(int id, String email, int age) {
		System.out.println("Hello VTI!");

	}
}

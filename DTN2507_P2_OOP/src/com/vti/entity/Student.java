package com.vti.entity;

public class Student {
	private int id;
	private String email;
	private String username;
	private String fullname;

// Thông qua các hàm
//	Setter
	public void setUsername(String username) {
		this.username = "VTI_" + username;

	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

//	Getter
	public String getUsername() {
		return this.username;
	}

	public String getFullname() {
		return this.fullname + "VTI";
	}

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

//	toString()
	@Override
	public String toString() {
		return "Student{id: " + this.id + " ,email: " + this.email + " ,username: " + this.username + " ,fullname: "
				+ this.fullname + " }";
	}

//	
}

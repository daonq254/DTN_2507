package com.vti.entity;

//public final class Account
public class Account {
//	Hãy khai báo để id tăng tự động từ 1
	private int id;
	private String name;
	public static String subject; // Môn học

	public final String country;

	public static int generateID = 1;

//	

	public final void showInfor() {
		System.out.println("I am Account");
	}
//	

	public Account(String country) {
		super();
		this.country = country;
		this.id = generateID;
		generateID++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", subject=" + subject + "]";
	}

}

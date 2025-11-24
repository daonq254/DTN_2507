package com.vti.entity;

public abstract class Account {
	protected int id;
	protected String email;
	protected String username;
	protected String fullname;

//	Hàm hiển thị thông tin
	public void showInfo() {
		System.out.println("ID: " + this.id);
		System.out.println("Email: " + this.email);
		System.out.println("Username: " + this.username);
		System.out.println("Fullname: " + this.fullname);
	}

//	
//	public abstract void goToVTI();
//
//	public abstract void login();
//
//	public abstract void attendClass();
//
//	public abstract void viewSchedule();
//
//	public abstract void sentFeedback();

//	Getter Setter

//	Alr + Shift + S
//	Hàm tạo không tham số
	public Account() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	// Hàm tạo có 4 tham số
	public Account(int id, String email, String username, String fullname) {
		super();
		this.id = id;
		this.email = email;
		this.username = username;
		this.fullname = fullname;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", username=" + username + ", fullname=" + fullname + "]";
	}

}

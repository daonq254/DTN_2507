package com.vti.entity;

public class Mentor extends Account {
//	private int id;
//	private String email;
//	private String username;
//	private String fullname;
	private int yearOfExperience;

	public int getYearOfExperience() {
		return yearOfExperience;
	}

	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

	public void showInfoMentor() {
//		System.out.println("ID: " + super.getId());
//		System.out.println("Email: " + super.getEmail());
//		System.out.println("Username: " + super.getUsername());
//		System.out.println("Fullname: " + super.getFullname());
		super.showInfo();
		System.out.println("YearOfExperience: " + this.yearOfExperience);
		System.out.println("id: " + id);
		System.out.println("email: " + email);
		System.out.println("username: " + username);
		System.out.println("fullname" + fullname);
	}
}

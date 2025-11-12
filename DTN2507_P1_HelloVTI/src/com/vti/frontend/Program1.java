package com.vti.frontend;

import java.time.LocalDate;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.PositionName;

public class Program1 {
	public static void main(String[] args) {
// Tạo ra các phòng ban
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "BOD";

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Sale";

		Department department3 = new Department();
		department3.id = 3;
		department3.name = "Maketing";

//		Tạo ra các Position
		Position position1 = new Position();
		position1.id = 1;
		position1.name = PositionName.Dev;

		Position position2 = new Position();
		position2.id = 2;
		position2.name = PositionName.PM;

		Position position3 = new Position();
		position3.id = 3;
		position3.name = PositionName.Scrum_Master;

//		Tạo ra các Account
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "daonq1@vti.com";
		account1.userName = "daonq1";
		account1.fullName = "daonq1";
		account1.department = department1;
		account1.position = position2;
		account1.createDate = LocalDate.of(2025, 11, 12);

		Account account2 = new Account();
		account2.id = 2;
		account2.email = "daonq2";
		account2.userName = "daonq2";
		account2.fullName = "Dao Nguyen 2";
		account2.department = department3;
		account2.position = position3;
		account2.createDate = LocalDate.of(2021, 03, 17);

		Account account3 = new Account();
		account3.id = 3;
		account3.email = "daonq3";
		account3.userName = "daonq3";
		account3.fullName = "Dao Nguyen 3";
		account3.department = department2;
		account3.position = position2;
		account3.createDate = LocalDate.now();

//		Tạo ra các Group
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Guita";
		group1.creator = account1;
		group1.createDate = LocalDate.now();

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Football";
		group2.creator = account1;
		group2.createDate = LocalDate.now();

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "Mentor";
		group3.creator = account3;
		group3.createDate = LocalDate.now();

//		Group mà account tham gia

		Group[] groups_account1 = { group1, group2 };
		account1.groups = groups_account1;

		Group[] groups_account2 = { group2 };
		account2.groups = groups_account2;

		Group[] groups_account3 = { group1, group2, group3 };
		account3.groups = groups_account3;

//		Chạy chương trình

//		In thông tin Account
		System.out.println("Thông tin Account 1");
		System.out.println("Id: " + account1.id);
		System.out.println("Email: " + account1.email);
		System.out.println("UserName: " + account1.userName);
		System.out.println("FullName: " + account1.fullName);
		System.out.println("Department: " + account1.department.name);
		System.out.println("Position: " + account1.position.name);
		System.out.println("CreateDate: " + account1.createDate);

//		
	}
}

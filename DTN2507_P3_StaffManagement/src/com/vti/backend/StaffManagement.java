package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.Engineer;
import com.vti.entity.Staff;
import com.vti.entity.Staff.Gender;

public class StaffManagement {
	private Scanner sc;

	private ArrayList<Staff> staffList;

	public StaffManagement() {
		super();
		sc = new Scanner(System.in);
	}

	// Hàm thêm cán bộ
	public void addStaff() {
//	Hỏi muốn thêm loại cán bộ nào: Công nhân, Kỹ sư, Nhân viên
		System.out.println("----------------------------------------------------");
		System.out.println("--------Lựa chọn chức năng bạn muốn sử dụng---------");
		System.out.println("---     1. Thêm Engineer                         ---");
		System.out.println("---     2. Thêm Worker                           ---");
		System.out.println("---     3. Thêm Employeee                        ---");
		System.out.println("----------------------------------------------------");
		int choose1 = sc.nextInt();
		switch (choose1) {
		case 1:
			// Thêm Kỹ sư
// Lấy dữ liệu từ người dùng và lưu vào các biến

//	System.out.println("Nhập vào tên Engineer: ");
			String nameEngineer = sc.next();
			System.out.println("Nhập vào tuổi Engineer: ");
			int ageEngineer = sc.nextInt();
			System.out.println("Nhập vào giới tính Engineer 1.Male, 2.Female, 3.Unknown: ");
			int flagEngineer = sc.nextInt();
			Gender genderName1 = null;
			switch (flagEngineer) {
			case 1:
				genderName1 = Gender.MALE;
				break;
			case 2:
				genderName1 = Gender.FEMALE;
				break;
			case 3:
				genderName1 = Gender.UNKNOWN;
				break;
			}
			System.out.println("Nhập vào địa chỉ Engineer: ");
			String addEngineer = sc.next();
			System.out.println("Nhập vào chuyên ngành Engineer: ");
			String specializedEngineer = sc.next();
// Tạo ra Kỹ sư
			Staff engineer = new Engineer(nameEngineer, ageEngineer, genderName1, addEngineer, specializedEngineer);
			staffList.add(engineer);
			break;
		case 2:

			break;
		case 3:

			break;
		default:
			break;
		}
	}

	public void findByName() {
		// TODO Auto-generated method stub

	}

	public void printListStaff() {
		// TODO Auto-generated method stub

	}

	public void deleteStaff() {
		// TODO Auto-generated method stub

	}

}

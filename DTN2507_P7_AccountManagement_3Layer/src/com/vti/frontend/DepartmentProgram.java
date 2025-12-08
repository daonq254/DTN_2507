package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.presentationlayer.DepartmentController;
import com.vti.entity.Department;

public class DepartmentProgram {

	private DepartmentController departmentController;

//	Hiển thị danh  sách Phòng ban
	public DepartmentProgram() throws FileNotFoundException, IOException {
		super();
		departmentController = new DepartmentController();
	}

	public void getAllDepartment() throws ClassNotFoundException, SQLException {
		System.out.println("Hiển thị danh sách Phòng ban");
		List<Department> listDepartments = departmentController.getAllDepartment();

		String leftAlignFormat = "| %-6d | %-21s |%n";

		System.out.format("+--------+-----------------------+%n");
		System.out.format("|   ID   | Department Name       |%n");
		System.out.format("+--------+-----------------------+%n");

		for (Department department : listDepartments) {
			System.out.format(leftAlignFormat, department.getId(), department.getName());
		}
		System.out.format("+--------+-----------------------+%n");
	}

}

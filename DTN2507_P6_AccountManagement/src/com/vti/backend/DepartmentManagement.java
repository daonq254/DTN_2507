package com.vti.backend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.dao.DepartmentDao;
import com.vti.entity.Department;
import com.vti.utils.ScannerUtils;

public class DepartmentManagement {

	private DepartmentDao departmentDao;

	public DepartmentManagement() throws FileNotFoundException, IOException {
		super();
		departmentDao = new DepartmentDao();
	}

	public void getAllDepartment() throws ClassNotFoundException, SQLException {
		System.out.println("Hiển thị danh sách phòng ban trên hệ thống");

		List<Department> lisDepartments = departmentDao.getAllDepartment();
		String leftAlignFormat = "| %-6d | %-21s |%n";

		System.out.format("+--------+-----------------------+%n");
		System.out.format("|   ID   | Department Name       |%n");
		System.out.format("+--------+-----------------------+%n");

		for (Department department : lisDepartments) {
			System.out.format(leftAlignFormat, department.getId(), department.getName());
		}
		System.out.format("+--------+-----------------------+%n");

	}

	public void getDepartmentById_5() throws ClassNotFoundException, SQLException {
		System.out.println("Thông tin phòng ban số 5");
		Department department_5 = departmentDao.getDepartmentById_5();
		String leftAlignFormat = "| %-6d | %-21s |%n";

		System.out.format("+--------+-----------------------+%n");
		System.out.format("|   ID   | Department Name       |%n");
		System.out.format("+--------+-----------------------+%n");
		System.out.format(leftAlignFormat, department_5.getId(), department_5.getName());

	}

	public void getDepartmentById() throws ClassNotFoundException, SQLException {
		System.out.println("Tìm phòng ban theo ID");
		System.out.println("Mời bạn nhập vào ID của phòng ban cần tìm kiếm");
		int idFind = ScannerUtils.inputIntPositive();

		Department department = departmentDao.getDepartmentById(idFind);

		String leftAlignFormat = "| %-6d | %-21s |%n";

		System.out.format("+--------+-----------------------+%n");
		System.out.format("|   ID   | Department Name       |%n");
		System.out.format("+--------+-----------------------+%n");
		System.out.format(leftAlignFormat, department.getId(), department.getName());
	}

	public void createDepartment() throws ClassNotFoundException, SQLException {
		System.out.println("Tạo mới phòng ban");
		System.out.println("Mời bạn nhập vào tên của phòng ban");
		String name = ScannerUtils.inputString();

		Boolean resutlCreate = departmentDao.createDepartment(name);
		if (resutlCreate) {
			System.out.println("Create Successfully!!");
			getAllDepartment();
		} else {
			System.out.println("Error!!");

		}

	}

}

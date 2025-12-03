package com.vti.frontend;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.vti.entity.Department;

public class Program {
	public static void main(String[] args) throws FileNotFoundException, IOException {
//		Load dữ liệu từ file database.properties
		Properties properties = new Properties();
		try {

			properties.load(new FileInputStream(
					"C:\\Users\\ThinkPad\\eclipse-workspace\\DTN2507\\DTN2507_P5_DemoConnectDB\\src\\com\\vti\\resources\\database.properties"));
			String url = properties.getProperty("url");
			String username = properties.getProperty("username");
			String password = properties.getProperty("password");

			Connection connection = DriverManager.getConnection(url, username, password);
			// Thêm dữ liệu
			addNewDepartment(connection);
			// Hiển thị dữ liệu
			getDepartmentList(connection);
			// Update dữ liệu
			updateDepartmentList(connection);
			// Hiển thị dữ liệu
			deleteDepartmentList(connection);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void deleteDepartmentList(Connection connection) {
		// TODO Auto-generated method stub

	}

	private static void updateDepartmentList(Connection connection) {
		// TODO Auto-generated method stub

	}

	private static void addNewDepartment(Connection connection) throws SQLException {
		String data_Department = "MKT";
		String sqlInsertDepartment = "INSERT INTO department(DepartmentName) VALUES (?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sqlInsertDepartment);
		preparedStatement.setString(1, data_Department);

		int resultInsert = preparedStatement.executeUpdate();
		System.out.println("resultInsert: " + resultInsert);
	}

	private static void getDepartmentList(Connection connection) throws SQLException {
		Statement statement = connection.createStatement();

		String sqlGetDepartment = "SELECT * FROM department ORDER BY DepartmentID";
		ResultSet resultSet = statement.executeQuery(sqlGetDepartment); // lấy được bảng dữ liệu Department

		// Chuyển đổi Resutl Set sang List<Department>
		List<Department> departments = new ArrayList();
		while (resultSet.next()) {
			Department department = new Department(resultSet.getInt("DepartmentID"),
					resultSet.getString("DepartmentName"));
			departments.add(department);

		}
		for (Department department : departments) {
			System.out.println(department);
		}

	}
}

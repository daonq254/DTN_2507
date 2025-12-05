package com.vti.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Department;
import com.vti.utils.JdbcUtils;

public class DepartmentDao {
	private JdbcUtils jdbcUtils;

	public DepartmentDao() throws FileNotFoundException, IOException {
		super();
		jdbcUtils = new JdbcUtils();
	}

	public List<Department> getAllDepartment() throws ClassNotFoundException, SQLException {
		String sqlGetDepartment = "SELECT * FROM department ORDER BY DepartmentID";
		ResultSet resultSet = jdbcUtils.executeQuery(sqlGetDepartment);

		// Chuyển đổi Resutl Set sang List<Department>
		List<Department> departments = new ArrayList();
		while (resultSet.next()) {
			Department department = new Department(resultSet.getInt("DepartmentID"),
					resultSet.getString("DepartmentName"));
			departments.add(department);

		}
		jdbcUtils.disConnection();
		return departments;

	}

	public Department getDepartmentById_5() throws ClassNotFoundException, SQLException {
		String sqlGetDepartment = "SELECT * FROM department WHERE DepartmentID = 5";
		ResultSet resultSet = jdbcUtils.executeQuery(sqlGetDepartment); // tối đa 1 bản ghi

		if (resultSet.next()) {
			Department department = new Department(resultSet.getInt("DepartmentID"),
					resultSet.getString("DepartmentName"));
			jdbcUtils.disConnection();
			return department;

		}
		jdbcUtils.disConnection();
		return null;

	}

	public Department getDepartmentById(int idFind) throws ClassNotFoundException, SQLException {
		String sqlGetDepartmentById = "SELECT * FROM department WHERE DepartmentID = ?";
		PreparedStatement preparedStatement = jdbcUtils.createPrepareStatement(sqlGetDepartmentById);
		preparedStatement.setInt(1, idFind);

		ResultSet resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {
			Department department = new Department(resultSet.getInt("DepartmentID"),
					resultSet.getString("DepartmentName"));
			jdbcUtils.disConnection();
			return department;

		}
		jdbcUtils.disConnection();
		return null;

	}

	public Boolean createDepartment(String name) throws ClassNotFoundException, SQLException {
		String sqlInsertDepartment = "INSERT INTO department (`DepartmentName`) VALUES (?);";
		PreparedStatement preparedStatement = jdbcUtils.createPrepareStatement(sqlInsertDepartment);
		preparedStatement.setString(1, name);

		if (preparedStatement.executeUpdate() == 1) {
			jdbcUtils.disConnection();
			return true;
		} else {
			jdbcUtils.disConnection();
			return false;
		}

	}

}

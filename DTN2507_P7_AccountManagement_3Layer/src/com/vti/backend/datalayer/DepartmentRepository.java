package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Department;
import com.vti.utils.JdbcUtils;

public class DepartmentRepository implements IDepartmentRepository {
	private JdbcUtils jdbcUtils;

	public DepartmentRepository() throws FileNotFoundException, IOException {
		super();
		jdbcUtils = new JdbcUtils();
	}

	@Override
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

}

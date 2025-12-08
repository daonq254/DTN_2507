package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Department;

public interface IDepartmentService {

	List<Department> getAllDepartment() throws ClassNotFoundException, SQLException;

	Department getDepartmentById(int id);

}

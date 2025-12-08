package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.utils.ScannerUtils;

public class DepartmentMenu {

	private DepartmentProgram departmentProgram;

	public DepartmentMenu() throws FileNotFoundException, IOException {
		super();
		departmentProgram = new DepartmentProgram();
	}

	public void showMenuDepartment() throws ClassNotFoundException, SQLException {
		while (true)

		{
			String leftAlignFormat = "| %-72s |%n";
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format("|                        Choose please                                     |%n");
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format(leftAlignFormat, "1. Get list departments");
			System.out.format(leftAlignFormat, "2. Get department by id");
			System.out.format(leftAlignFormat, "3. Check department name exists");
			System.out.format(leftAlignFormat, "4. Create data – create department");
			System.out.format(leftAlignFormat, "5. Update data – update department");
			System.out.format(leftAlignFormat, "6. Delete by ID");
			System.out.format(leftAlignFormat, "7. Exit");
			System.out.format("+--------------------------------------------------------------------------+%n");

			int choose = ScannerUtils.inputIntPositive();

			switch (choose) {
			case 1:
				departmentProgram.getAllDepartment();
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				return;
			default:
				System.out.println("Nhập lại:");
				break;
			}

		}
	}
}

package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.utils.ScannerUtils;

public class Program {
	public static void main(String[] args)
			throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		DepartmentProgram departmentProgram = new DepartmentProgram();

		while (true) {
			String leftAlignFormat = "| %-72s |%n";
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format("|                        Choose please                                     |%n");
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format(leftAlignFormat, "1. Question 1: Account Management");
			System.out.format(leftAlignFormat, "2. Question 2: Department Management");
			System.out.format(leftAlignFormat, "3. Question 3: Position Management");

			System.out.format(leftAlignFormat, "4. Exit");
			System.out.format("+--------------------------------------------------------------------------+%n");

			int choose = ScannerUtils.inputIntPositive();

			switch (choose) {
			case 1:
				break;
			case 2:
				departmentProgram.showMenuDepartment();
				break;
			case 3:

				break;

			case 4:
				return;
			default:
				System.out.println("Nhập lại:");
				break;
			}

		}
	}
}

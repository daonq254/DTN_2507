package com.vti.frontend;

import com.vti.entity.Account;

public class Demo4 {
	public static void main(String[] args) {
// Sử dụng tên lớp để gọi thuộc tính Subject
		Account.subject = "Java";

		Account account1 = new Account("VN");
//		account1.setId(1);
		account1.setName("Việt");
//		account1.setSubject("Java");

		Account account2 = new Account("US");
//		account2.setId(2);
		account2.setName("Ngân");
//		account2.setSubject("Java");

		Account account3 = new Account("UK");
//		account3.setId(3);
		account3.setName("Hiếu");
//		account3.setSubject("Java");

		Account account4 = new Account("JP");
//		account4.setId(4);
		account4.setName("Linh");
//
		System.out.println(account1.toString());
		System.out.println(account2.toString());
		System.out.println(account3.toString());
		System.out.println(account4.toString());
//
		System.out.println("-----------");
		System.out.println("account1, Subject:" + account1.subject);
		System.out.println("account2, Subject:" + account2.subject);
		System.out.println("account3, Subject:" + account3.subject);

		System.out.println("-----Spring FW------");
		Account.subject = "Spring FW";
		System.out.println("account1, Subject:" + account1.subject);
		System.out.println("account2, Subject:" + account2.subject);
		System.out.println("account3, Subject:" + account3.subject);

		System.out.println("-----Linux------");
		account1.subject = "Linux";
		System.out.println("account1, Subject:" + account1.subject); // Linux

		System.out.println("account2, Subject:" + account2.subject); // Spring FW
		System.out.println("account3, Subject:" + account3.subject); // Spring FW

		System.out.println("account1, generateID:" + account1.generateID); // Spring FW

		System.out.println("-------Final---------");
//		account1.country = "VN";
//		account2.country = "VN";
//
//		account1.country = "HQ";
		System.out.println("account1: " + account1.country);
		System.out.println("account2: " + account2.country);
		System.out.println("account3: " + account3.country);
//		account1.country = "HQ";

	}
}

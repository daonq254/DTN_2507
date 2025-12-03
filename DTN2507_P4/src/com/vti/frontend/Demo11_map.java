package com.vti.frontend;

import java.util.Map;
import java.util.TreeMap;

public class Demo11_map {
	public static void main(String[] args) {
//	Tạo ra Map để lưu trữ
		Map<String, String> studentMap = new TreeMap<String, String>();
		studentMap.put("vti_05", "Ngân");
		studentMap.put("vti_01", "Tân");
		studentMap.put("vti_02", "Hạnh");
		studentMap.put("vti_04", "Linh");
		studentMap.put("vti_03", "Việt");

		System.out.println("Thông tin các phần tử");
		for (Map.Entry<String, String> entry : studentMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}
		System.out.println("Học viên có mã vti_05:" + studentMap.get("vti_05"));
	}
}

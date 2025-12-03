package com.vti.frontend;

import java.util.SortedSet;
import java.util.TreeSet;

public class Demo10_Treeset {
	public static void main(String[] args) {
		SortedSet<String> traineeNameTreeset = new TreeSet<String>();
		traineeNameTreeset.add("Chấn");
		traineeNameTreeset.add("Thanh");
		traineeNameTreeset.add("An");
		traineeNameTreeset.add("Hùng");
		traineeNameTreeset.add("Bắc");
		traineeNameTreeset.add("Bình");
		traineeNameTreeset.add("Nam");

		for (String trainee : traineeNameTreeset) {
			System.out.println(trainee);
		}
	}
}

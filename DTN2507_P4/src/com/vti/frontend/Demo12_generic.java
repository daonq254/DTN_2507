package com.vti.frontend;

import com.vti.entity.Trainee;

public class Demo12_generic {
	public static void main(String[] args) {
//		Trainee trainee1 = new Trainee();
//		trainee1.setId(1);
//		trainee1.setName("Hiếu");

//		id: int(1,2,3,4,5)
//		id: string (vti_001, vti_002, vti_003)

//		Trainee_String trainee2 = new Trainee_String();
//		trainee2.setId("vti_001");
//		trainee2.setName("Hiếu");

//		id: float (0.001, 0.002, 0.002)

		Trainee<Integer> trainee1 = new Trainee<Integer>();
		trainee1.setId(1);
		trainee1.setName("Hiếu");

		Trainee<String> trainee2 = new Trainee<String>();
		trainee2.setId("VTI_001");
		trainee1.setName("Nam");

	}
}

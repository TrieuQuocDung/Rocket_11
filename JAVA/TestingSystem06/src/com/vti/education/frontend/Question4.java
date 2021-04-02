package com.vti.education.frontend;

import com.vti.education.entity.Department;

public class Question4 {
	private static Department[] departments = new Department[3];
	public static void main(String[] args) {
		Department department1 = new Department(1, "Sale");
		Department department2 = new Department(2, "Marketing");
		Department department3 = new Department(3, "BOD");

		departments[0] = department1;
		departments[1] = department2;
		departments[2] = department3;
		getIndex(5);
	}

	private static void getIndex(int index) {
		try {
			System.out.println(departments[index]);
		} catch (Exception e) {
			System.out.println("Cannot find department!");
		}
	}
}

package com.vti.education.entity;

import com.vti.education.utils.ScannerUtils;

public class Department {
	private int id;
	private String name;
	public Department() {
		input();
		// TODO Auto-generated constructor stub
	}
	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	private void input() {
		System.out.println("Nhập id : ");
		id = ScannerUtils.inputInt("Please input a id as int, please input again.");

		System.out.println("Nhập tên : ");
		name = ScannerUtils.inputString("Please input a name, please input again.");
	}

	
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
}

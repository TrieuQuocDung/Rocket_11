package com.vti.acedamy.entity;

import java.util.Scanner;

public class congNhan extends canBo{
	 private String congViec;
	 private Scanner scanner;
	public congNhan() {
		scanner = new Scanner(System.in);
		inputInfo();
	}
	public congNhan(String name, int age, boolean gender, String congViec) {
		super(name, age, gender);
		this.congViec=congViec;
	}
	public String getCongViec() {
		return congViec;
	}
	@Override
	public void inputInfo() {
		super.inputInfo();
		System.out.print("Mời bạn nhập vào công việc: ");
		congViec = scanner.nextLine();
	}
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Công việc: " + congViec);
	}
}

package com.vti.education.entity.Question2Polymorphism;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
	protected String name;
	protected boolean gender;
	protected LocalDate birthday;
	protected String address;
	private Scanner scanner;
	
	
	public Person() {
		inputInfo();
		
	}
	
	public Person(String name, boolean gender, LocalDate birthday, String address) {
		super();
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void inputInfo() {
		scanner = new Scanner(System.in);
		System.out.print("Mời bạn nhập vào tên");
		name = scanner.nextLine();
		System.out.print("Mời bạn nhập vào giới tính(nam/nữ)");
		String gt = scanner.nextLine();
		gender = gt.equals("nam") ? true: false;
		System.out.println("Nhập ngày sinh (yyyy-MM-dd): ");
		birthday = LocalDate.parse(scanner.nextLine());
		System.out.println("Nhập địa chỉ: ");
		address = scanner.nextLine();
		scanner.nextLine();

	}
	public void showInfo() {
		System.out.println("Tên: " + name);
		System.out.println("Giới tính: " + gender);
		System.out.println("Ngày sinh: " + birthday);
		System.out.println("Địa chỉ: " + address);

	}


}

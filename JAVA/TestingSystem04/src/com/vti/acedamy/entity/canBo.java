package com.vti.acedamy.entity;

import java.util.Scanner;

 public class canBo {
	protected String name;
	protected int age;
	protected boolean gender;
	private Scanner scanner;

	public canBo() {

	}

	public canBo(String name, int age, boolean gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		scanner = new Scanner(System.in);
		
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean isGender() {
		return gender;
	}

	public void inputInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Mời bạn nhập vào tên");
		name = scanner.nextLine();
		System.out.print("Mời bạn nhập vào tuổi");
		age = scanner.nextInt();
		System.out.print("Mời bạn nhập vào giới tính(nam/nữ)");
		String gt = scanner.nextLine();
		gender = gt.equals("nam") ? true: false;
		scanner.nextLine();

	}
	public void showInfo() {
		System.out.println("Họ tên:"+" "+ name);
		System.out.println("Tuổi:"+" "+ age);
		System.out.println("Giới tính:"+" " + gender);

	}
}

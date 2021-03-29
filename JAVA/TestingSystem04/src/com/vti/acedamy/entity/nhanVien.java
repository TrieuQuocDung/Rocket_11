package com.vti.acedamy.entity;

import java.util.Scanner;

public class nhanVien extends canBo {
	private int bac;
	private Scanner scanner;

	public nhanVien() {
		scanner = new Scanner(System.in);
		inputInfo();
	}

	public nhanVien(String name, int age, boolean gender, int bac) {
		super(name, age, gender);
		this.bac = bac;
		scanner = new Scanner(System.in);
	}

	public int getBac() {
		return bac;
	}

	@Override
	public void inputInfo() {
		super.inputInfo();
		System.out.print("Mời bạn nhập vào bac: ");
		bac = scanner.nextInt();
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Bậc: " + bac);
	}
}
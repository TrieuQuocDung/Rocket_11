package com.vti.acedamy.entity;

import java.util.Scanner;

public class kySu extends canBo{
	 private String nganhDaoTao;
	 private Scanner scanner;
	public kySu() {
		scanner = new Scanner(System.in);
		inputInfo();
	}
	public kySu(String name, int age, boolean gender,String nganhDaoTao) {
		super(name, age, gender);
		this.nganhDaoTao=nganhDaoTao;
		scanner = new Scanner(System.in);
	}
	 
	public String  getNganhDT() {
		return nganhDaoTao;
	}
	@Override
	public void inputInfo() {
		super.inputInfo();
		System.out.print("Mời bạn nhập vào Ngành đào tạo: ");
		nganhDaoTao = scanner.nextLine();
	}
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Ngành Đào Tạo: " + nganhDaoTao);
	}
}

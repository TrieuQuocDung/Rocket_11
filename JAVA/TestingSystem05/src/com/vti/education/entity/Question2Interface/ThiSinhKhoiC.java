package com.vti.education.entity.Question2Interface;

import java.util.Scanner;

public class ThiSinhKhoiC extends ThiSinh{
	private float van;
	private float su ;
	private float dia;
	private Scanner scanner;

	public ThiSinhKhoiC() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ThiSinhKhoiC(String soBaoDanh, String hoTen, String diaChi, int mucUuTien,String monThi ,String tenKhoi) {
		super(soBaoDanh, hoTen, diaChi, mucUuTien,monThi, tenKhoi);
//		this.van = van;
//		this.su = su;
//		this.dia = dia;
		scanner = new Scanner(System.in);
	}
	public float getVan() {
		return van;
	}
	public float getSu() {
		return su;
	}
	public float getDia() {
		return dia;
	}
	@Override
	public void inputInfo() {
		super.inputInfo();
		System.out.println("Mời bạn nhập điểm môn Văn");
		van = scanner.nextFloat();
		System.out.println("Mời bạn nhập điểm môn Sử");
		su = scanner.nextFloat();
		System.out.println("Mời bạn nhập điểm môn Địa");
		dia = scanner.nextFloat();
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Văn: " + van);
		System.out.println("Sử: " + su);
		System.out.println("Địa: " + dia);

	}
}

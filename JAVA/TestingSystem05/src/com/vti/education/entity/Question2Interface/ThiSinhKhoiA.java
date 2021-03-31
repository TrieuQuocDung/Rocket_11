package com.vti.education.entity.Question2Interface;

import java.util.Scanner;

public class ThiSinhKhoiA extends ThiSinh {
	private float toan;
	private float ly;
	private float hoa;
	private Scanner scanner;

	public ThiSinhKhoiA() {
		scanner = new Scanner(System.in);
		inputInfo();
	}

	public ThiSinhKhoiA(String soBaoDanh, String hoTen, String diaChi, int mucUuTien, String monThi, String tenKhoi) {
		super(soBaoDanh, hoTen, diaChi, mucUuTien, monThi, tenKhoi);
//		this.toan = toan;
//		this.ly = ly;
//		this.hoa = hoa;
		scanner = new Scanner(System.in);
	}

	public float getToan() {
		return toan;
	}

	public float getLy() {
		return ly;
	}

	public float getHoa() {
		return hoa;
	}

	@Override
	public void inputInfo() {
		super.inputInfo();
		System.out.println("Mời bạn nhập điểm môn Toán");
		toan = scanner.nextFloat();
		System.out.println("Mời bạn nhập điểm môn Lý");
		ly = scanner.nextFloat();
		System.out.println("Mời bạn nhập điểm môn Hóa");
		hoa = scanner.nextFloat();
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Toán: " + toan);
		System.out.println("Lý: " + ly);
		System.out.println("Hóa: " + hoa);

	}
}

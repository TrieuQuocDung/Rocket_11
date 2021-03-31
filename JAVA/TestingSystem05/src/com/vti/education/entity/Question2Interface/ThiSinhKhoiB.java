package com.vti.education.entity.Question2Interface;

import java.util.Scanner;

public class ThiSinhKhoiB extends ThiSinh{
	private float toan;
	private float hoa;
	private float sinh;
	private Scanner scanner;
	public ThiSinhKhoiB() {
		scanner = new Scanner(System.in);
		inputInfo();
	}

	public ThiSinhKhoiB(String soBaoDanh, String hoTen, String diaChi, int mucUuTien,String monThi ,String tenKhoi) {
		super(soBaoDanh, hoTen, diaChi, mucUuTien, monThi,tenKhoi);
//		this.toan = toan;
//		this.hoa = hoa;
//		this.sinh = sinh;
		scanner = new Scanner(System.in);
	}
	public float getToan() {
		return toan;
	}
	public float getHoa() {
		return hoa;
	}
	public float getSinh() {
		return sinh;
	}
	@Override
	public void inputInfo() {
		super.inputInfo();
		System.out.println("Mời bạn nhập điểm môn Toán");
		toan = scanner.nextFloat();
		System.out.println("Mời bạn nhập điểm môn Hóa");
		hoa = scanner.nextFloat();
		System.out.println("Mời bạn nhập điểm môn Sinh");
		sinh = scanner.nextFloat();
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Toán: " + toan);
		System.out.println("Hóa: " + hoa);
		System.out.println("Sinh: " + sinh);

	}
}

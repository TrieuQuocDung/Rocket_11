package com.vti.education.entity.Question2Interface;

import java.util.Scanner;

public class ThiSinh{
	protected String soBaoDanh;
	protected String hoTen;
	protected String diaChi;
	protected int mucUuTien;
	protected String tenKhoi;
	protected String monThi;
	private Scanner  scanner;
	public ThiSinh() {
	}
	public ThiSinh(String soBaoDanh, String hoTen, String diaChi, int mucUuTien, String khoi,String monThi) {
		super();
		this.soBaoDanh = soBaoDanh;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.mucUuTien = mucUuTien;

	}
	public String getSoBaoDanh() {
		return soBaoDanh;
	}
	public String getHoTen() {
		return hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public int getMucUuTien() {
		return mucUuTien;
	}
	public String getTenKhoi() {
		return tenKhoi;
	}

	public void setTen(String tenKhoi) {
		this.tenKhoi = tenKhoi;
	}
	public String getMonThi() {
		if (tenKhoi.equals("A")) {
			monThi = "Toán, Lý, Hóa";

		} else if (tenKhoi.equals("B")) {
			monThi = "Toán, Hóa, Sinh";

		} else if (tenKhoi.equals("C")) {
			monThi = "Văn, Sử, Địa";

		} else {
			monThi = "Không xác định";
		}

		return monThi;

	}
	public void inputInfo() {
		scanner = new Scanner(System.in);
		System.out.print("Mời bạn nhập vào sbd:");
		soBaoDanh = scanner.nextLine();
		System.out.print("Mời bạn nhập vào Họ tên:");
		hoTen = scanner.nextLine();
		System.out.print("Mời bạn nhập vào địa chỉ:");
		diaChi = scanner.nextLine();
		System.out.print("Mời bạn nhập vào mức ưu tiên:");
		mucUuTien = scanner.nextInt();
		scanner.nextLine();
		

	}
	@Override
	public String toString() {
		return "ThiSinh [soBaoDanh=" + soBaoDanh + "]";
	}
	
	public void showInfo() {
		System.out.println("Số báo danh:"+" "+ soBaoDanh);
		System.out.println("Họ tên:"+" "+ hoTen);
		System.out.println("Địa chỉ:"+" " + diaChi);
		System.out.println("Mức ưu tiên:"+" " + mucUuTien);
		
		

	}
	
}

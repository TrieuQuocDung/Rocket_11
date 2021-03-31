package com.vti.education.entity.Question2Polymorphism;

import java.time.LocalDate;
import java.util.Scanner;

public class Student extends Person {
	private int maSV;
	private float diemTB;
	private String email;
	private boolean isStudentGetScholarship;
	private Scanner scanner;

	public Student() {
		inputInfo();

	}

	public Student(String name, boolean gender, LocalDate birthday, String address, int maSV, float diemTB,
			String email) {
		super(name, gender, birthday, address);
		this.maSV = maSV;
		this.diemTB = diemTB;
		this.email = email;
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public float getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void inputInfo() {
		scanner = new Scanner(System.in);

		System.out.println("Nhập mã sinh viên: ");
		maSV = scanner.nextInt();

		super.inputInfo();

		System.out.println("Nhập điểm trung bình: ");
		diemTB = scanner.nextFloat();

		System.out.println("Nhập email: ");
		email = scanner.nextLine();

	}

	@Override
	public void showInfo() {
		System.out.println("Mã sinh viên: " + maSV);
		super.showInfo();
		System.out.println("Điểm trung bình: " + diemTB);
		System.out.println("Email: " + diemTB);
	}

	public boolean isStudentGetScholarship() {
		return diemTB >= 8;
	}

}

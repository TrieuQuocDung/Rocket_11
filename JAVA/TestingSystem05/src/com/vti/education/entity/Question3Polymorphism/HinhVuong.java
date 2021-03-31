package com.vti.education.entity.Question3Polymorphism;

public class HinhVuong extends HinhChuNhat {
	public float tinhChuVi(float a) {
		float chuViHv = a * a;
		System.out.println("Chu vi hình vuông:" + chuViHv );
		return chuViHv;
	}

	public float tinhDienTich(float a) {
		float dienTichHv = a*a;
		System.out.println("Diện tích hình vuông:" +dienTichHv );
		return dienTichHv;
	}
}

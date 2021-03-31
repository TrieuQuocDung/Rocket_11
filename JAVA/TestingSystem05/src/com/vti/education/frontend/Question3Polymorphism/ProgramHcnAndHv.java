package com.vti.education.frontend.Question3Polymorphism;

import com.vti.education.entity.Question3Polymorphism.HinhChuNhat;
import com.vti.education.entity.Question3Polymorphism.HinhVuong;

public class ProgramHcnAndHv {

	public static void main(String[] args) {
		HinhChuNhat hcn = new HinhChuNhat();
		hcn.chuVi (4,5);
		hcn.dienTich(4,5);
		
		HinhVuong hv = new HinhVuong();
		hv.tinhChuVi(7);
		hv.tinhDienTich(7);
	}

}

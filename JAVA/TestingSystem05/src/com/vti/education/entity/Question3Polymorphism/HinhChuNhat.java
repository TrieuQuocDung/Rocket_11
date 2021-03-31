package com.vti.education.entity.Question3Polymorphism;

public class HinhChuNhat implements IHCN {
	

	@Override
	public float chuVi(float a, float b) {
		 float chuvi =(a + b) * 2;
		System.out.println("  a:" + a);
		System.out.println(" b:" + b);
		System.out.println("Chu vi HCN:" + chuvi);
		return chuvi;
	}

	@Override
	public float dienTich(float a, float b) {
		System.out.println("Diện tích HCN:");
		return a * b;
	}

}

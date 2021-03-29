package com.vti.acedamy.entity;

public class Employee extends User{
	public Employee(String name, double salaryRatio) {
		super(name, salaryRatio);
	}

	@Override
	public double calculatePay() {
		return salaryRatio * 420;
	}

}

package com.vti.acedamy.entity;

public class HighSchoolStudent extends Students {
	private String clazz;
	private String desiredUniversity;

	public HighSchoolStudent(String name, int id, String clazz, String desiredUniversity) {
		super(name, id);
		this.clazz = clazz;
		this.desiredUniversity = desiredUniversity;

	}

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public String getDesiredUniversity() {
		return desiredUniversity;
	}

	public void setDesiredUniversity(String desiredUniversity) {
		this.desiredUniversity = desiredUniversity;
	}

	@Override
	public String toString() {
		return "Thông tin Học sinh:" + "\nID:" + this.id + "\nTên:" + this.name + "\nLớp đang học:" + this.clazz
				+ "\nĐại học mong muốn:" + this.desiredUniversity;
	}
}

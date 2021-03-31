package com.vti.education.entity.Quetion1Polymorphism;

public class Student implements IStudent{
	private int id;
	private String name;
	private int group;
	
	
	
	public Student(int id, String name, int group) {
		this.id = id;
		this.name = name;
		this.group = group;
	}

	public Student() {
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getGroup() {
		return group;
	}
	@Override
	public void caLopDiemDanh() {
		System.out.println(name +" "+ "điểm danh");
	}
	@Override
	public void nhomDiHocBai() {
		System.out.println(name +" "+ "đang đi học bài");
	}
	@Override
	public void nhomDiDonVeSinh() {
		System.out.println(name +" "+ "đang đi dọn vệ sinh");		
	}
}

package com.vti.acedamy.entity;

public class Student {
	private int id;
	private String name;
	private String hometown;
	private float point;
	
	Student(int id,String name , String hometown){
		this.id=id;
		this.name=name;
		this.hometown=hometown;
		this.point=0;
	}
	
	public int getID() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getHometown() {
		return hometown;
	}
	public float getPoint() {
		return point;
	}
	
	public void setID(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setHometown(String hometown) {
		this.hometown=hometown;
	}
	public void setID(float point) {
		this.point=point;
	}
	
   private void congDiem(float congDiem) {
	   this.point += congDiem;
}
}

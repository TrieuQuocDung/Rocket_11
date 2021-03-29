package com.vti.acedamy.entity;

public class Students extends Person {
	protected int id;

	public Students(String name ,int id) {
		super(name);
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}

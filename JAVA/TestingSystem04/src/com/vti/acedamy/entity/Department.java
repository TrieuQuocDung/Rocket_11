package com.vti.acedamy.entity;

public class Department {

	private String name;
	private int id;
	
	public Department() {
	}

	Department( String name){
		this.id=0;
		this.name=name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 
	
	
	
}

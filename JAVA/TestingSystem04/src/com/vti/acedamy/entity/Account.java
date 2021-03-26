package com.vti.acedamy.entity;

import java.util.Date;

public class Account {
	private int id;
	private String email, username, lastname, firstname, fullname, position;
	private Date createDate ;
	public Account() {

	}

	Account(int id, String email, String username, String lastname, String firstname, String fullname) {
		this.id = id;
		this.email = email;
		this.username = username;
		this.fullname = firstname + lastname;
	}

	Account(int id, String email, String username, String lastname, String firstname, String fullname,
			String position) {
		this.id = id;
		this.email = email;
		this.username = username;
		this.fullname = firstname + lastname;
		this.position = position;

	}
	public int getID() {
		return id;
	}
		
	public String getEmail() {
		return email;
	}

	public String getUser() {
		return username;

	}

	public String getFullname() {
		return fullname;

	}

	public String getPosition() {
		return position;

	}
	public void setID(int id) {
		this.id=id;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setUsername(String username) {
		this.username=username;
	}
	public void setFullname(String fullname) {
		this.fullname=fullname;
	}
	public void setPosition(String position) {
		this.position=position;
	}
	
	
}

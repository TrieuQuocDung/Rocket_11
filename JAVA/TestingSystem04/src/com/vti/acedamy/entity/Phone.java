package com.vti.acedamy.entity;

public abstract class Phone {
	private  String[] contacts;
	private String name;
	private String number;
	public abstract void insertContact(String name, String number);

	public abstract void removeContact(String name);

	public abstract void updateContact(String name, String newNumber);

	public abstract void searchContact(String name);


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String[] getContacts() {
		return contacts;
	}

	public void setContacts(String[] contacts) {
		this.contacts = contacts;
	}


}

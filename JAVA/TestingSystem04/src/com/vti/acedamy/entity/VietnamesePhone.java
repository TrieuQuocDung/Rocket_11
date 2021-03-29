package com.vti.acedamy.entity;

public class VietnamesePhone extends Phone{

	public VietnamesePhone() {
		
	}

	@Override
	public void insertContact(String name, String number) {
		System.out.println("Insert new contact with " + name + " and phone " + number);
	}

	@Override
	public void removeContact(String name) {
		System.out.println("Removing contact with name :" + name);
	}

	@Override
	public void updateContact(String name, String newNumber) {
		System.out.println("Update contact " + name + " with new phone " + newNumber);
	}

	@Override
	public void searchContact(String name) {
		System.out.println("Search contact " + name + "...");
	}
}

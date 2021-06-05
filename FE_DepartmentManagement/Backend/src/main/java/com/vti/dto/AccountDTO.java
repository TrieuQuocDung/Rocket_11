package com.vti.dto;

public class AccountDTO {
	private short id;

	private String fullName;

	public AccountDTO() {
	}

	public AccountDTO(short id, String fullName) {
		super();
		this.id = id;
		this.fullName = fullName;
	}

	public short getId() {
		return id;
	}

	public String getFullName() {
		return fullName;
	}

}

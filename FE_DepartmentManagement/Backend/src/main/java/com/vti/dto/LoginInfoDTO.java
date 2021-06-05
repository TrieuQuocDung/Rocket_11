package com.vti.dto;

public class LoginInfoDTO {
	private short id;

	private String fullName;
	private String role;

	public LoginInfoDTO() {
	}

	public LoginInfoDTO(short id, String fullName,String role) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.role = role;
	}

	public short getId() {
		return id;
	}

	public String getFullName() {
		return fullName;
	}

	public String getRole() {
		return role;
	}

	
	
	
}

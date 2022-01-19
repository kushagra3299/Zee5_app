package com.zee.zee5_app.dto;

import lombok.Data;

@Data
public class Register {
	
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String addharcardnumber;
	
	public Register() {
		
		System.out.println("hello");
	}
	
}

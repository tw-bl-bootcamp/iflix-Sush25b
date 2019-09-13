package com.thoughtworks.iflix.dto;

/**
 * @author Sushant Phulsundar
 *
 */
public class UserLoginDto 
{
	private String emailId;
	private String password;
	
	public UserLoginDto(String emailId, String password) {
		this.emailId = emailId;
		this.password = password;
	}
	
}

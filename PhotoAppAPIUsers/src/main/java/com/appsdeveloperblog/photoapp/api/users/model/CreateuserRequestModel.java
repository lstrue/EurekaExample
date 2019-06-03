package com.appsdeveloperblog.photoapp.api.users.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateuserRequestModel {

	@NotNull(message="First name cannot be null")
	@Size(min=2, message="should not be less than 2")
	private String firstName;
	
	private String lastName;
	
	private String password;
	
	private String email;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

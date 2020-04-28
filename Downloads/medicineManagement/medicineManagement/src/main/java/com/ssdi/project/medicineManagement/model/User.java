package com.ssdi.project.medicineManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_details")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String firstName;
	private String lastName;
	private String email_address;
	private String password;
	private String user_role;
	
	
	
	public User() {
		super();
	}
	
	
	public User(String firstName, String lastName, String email_address, String password, String user_role) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email_address = email_address;
		this.password = password;
		this.user_role = user_role;
	}


	public int getId() {
		return userId;
	}
	public void setId(int userId) {
		this.userId = userId;
	}
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
	public String getEmail() {
		return email_address;
	}
	public void setEmail(String email_address) {
		this.email_address = email_address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getuser_role() {
		return user_role;
	}
	public void setuser_role(String user_role) {
		this.user_role = user_role;
	}
	@Override
	public String toString() {
		return "User [id=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email_address
				+ ", password=" + password + ", user_role=" + user_role + "]";
	}
	
	
	
	
}
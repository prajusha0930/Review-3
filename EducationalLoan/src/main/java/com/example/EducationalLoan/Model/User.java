package com.example.EducationalLoan.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
       @Id
       private int Id;
       private String Email;
       private String Password;
       private String Username;
       private String MobileNumber;
       private String UserRole;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getUserRole() {
		return UserRole;
	}
	public void setUserRole(String userRole) {
		UserRole = userRole;
	}
	public User(int id, String email, String password, String username, String mobileNumber, String userRole) {
		super();
		Id = id;
		Email = email;
		Password = password;
		Username = username;
		MobileNumber = mobileNumber;
		UserRole = userRole;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return String.format("User [Id=%s, Email=%s, Password=%s, Username=%s, MobileNumber=%s, UserRole=%s]", Id,
				Email, Password, Username, MobileNumber, UserRole);
	}
	   
       
}

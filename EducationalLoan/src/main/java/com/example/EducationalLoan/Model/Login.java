package com.example.EducationalLoan.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;

@Entity
public class Login {
	@Id
       private String Email;
       private String Password;
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
	public Login(String email, String password) {
		super();
		Email = email;
		Password = password;
	}
	public Login() {
		super();
	}
	@Override
	public String toString() {
		return String.format("Login [Email=%s, Password=%s]", Email, Password);
	}
       
}

package com.example.EducationalLoan.Model;

//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;


public class Admin {
       private String Email;
       private String Password;
       private String MobileNumber;
       private String UserRole;
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
	public Admin(String email, String password, String mobileNumber, String userRole) {
		super();
		Email = email;
		Password = password;
		MobileNumber = mobileNumber;
		UserRole = userRole;
	}
	public Admin() {
		super();
	}
	@Override
	public String toString() {
		return String.format("Admin [Email=%s, Password=%s, MobileNumber=%s, UserRole=%s]", Email, Password,
				MobileNumber, UserRole);
	}
       
}

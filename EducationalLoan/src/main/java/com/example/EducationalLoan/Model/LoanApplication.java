package com.example.EducationalLoan.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LoanApplication {
       @Id
       private int loanId;
       private String loantype;
       private String applicantName;
       private String applicantAddress;
       private String applicantMobile;
       private String applicantEmail;
       private String applicantAadhaar;
       private String applicantPan;
       private String applicantSalary;
       private String loanAmountRequired;
       private String loanRepaymentMonths;
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public String getLoantype() {
		return loantype;
	}
	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getApplicantAddress() {
		return applicantAddress;
	}
	public void setApplicantAddress(String applicantAddress) {
		this.applicantAddress = applicantAddress;
	}
	public String getApplicantMobile() {
		return applicantMobile;
	}
	public void setApplicantMobile(String applicantMobile) {
		this.applicantMobile = applicantMobile;
	}
	public String getApplicantEmail() {
		return applicantEmail;
	}
	public void setApplicantEmail(String applicantEmail) {
		this.applicantEmail = applicantEmail;
	}
	public String getApplicantAadhaar() {
		return applicantAadhaar;
	}
	public void setApplicantAadhaar(String applicantAadhaar) {
		this.applicantAadhaar = applicantAadhaar;
	}
	public String getApplicantPan() {
		return applicantPan;
	}
	public void setApplicantPan(String applicantPan) {
		this.applicantPan = applicantPan;
	}
	public String getApplicantSalary() {
		return applicantSalary;
	}
	public void setApplicantSalary(String applicantSalary) {
		this.applicantSalary = applicantSalary;
	}
	public String getLoanAmountRequired() {
		return loanAmountRequired;
	}
	public void setLoanAmountRequired(String loanAmountRequired) {
		this.loanAmountRequired = loanAmountRequired;
	}
	public String getLoanRepaymentMonths() {
		return loanRepaymentMonths;
	}
	public void setLoanRepaymentMonths(String loanRepaymentMonths) {
		this.loanRepaymentMonths = loanRepaymentMonths;
	}
	public LoanApplication(int loanId, String loantype, String applicantName, String applicantAddress,
			String applicantMobile, String applicantEmail, String applicantAadhaar, String applicantPan,
			String applicantSalary, String loanAmountRequired, String loanRepaymentMonths) {
		super();
		this.loanId = loanId;
		this.loantype = loantype;
		this.applicantName = applicantName;
		this.applicantAddress = applicantAddress;
		this.applicantMobile = applicantMobile;
		this.applicantEmail = applicantEmail;
		this.applicantAadhaar = applicantAadhaar;
		this.applicantPan = applicantPan;
		this.applicantSalary = applicantSalary;
		this.loanAmountRequired = loanAmountRequired;
		this.loanRepaymentMonths = loanRepaymentMonths;
	}
	public LoanApplication() {
		super();
	}
	@Override
	public String toString() {
		return String.format(
				"LoanApplication [loanId=%s, loantype=%s, applicantName=%s, applicantAddress=%s, applicantMobile=%s, applicantEmail=%s, applicantAadhaar=%s, applicantPan=%s, applicantSalary=%s, loanAmountRequired=%s, loanRepaymentMonths=%s]",
				loanId, loantype, applicantName, applicantAddress, applicantMobile, applicantEmail, applicantAadhaar,
				applicantPan, applicantSalary, loanAmountRequired, loanRepaymentMonths);
	}
       
}

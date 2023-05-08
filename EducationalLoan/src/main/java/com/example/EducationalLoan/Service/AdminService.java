package com.example.EducationalLoan.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EducationalLoan.Model.LoanApplication;
import com.example.EducationalLoan.Repository.LoanApplicationRepository;

@Service
public class AdminService {
 

 @Autowired
 LoanApplicationRepository loanapplicationrepository;
 
 public LoanApplication saveDetails(LoanApplication l)
 {
  return loanapplicationrepository.save(l);
 }

 public List<LoanApplication> getAllLoans() {
  return loanapplicationrepository.findAll();
 }
 public  LoanApplication updateLoans(LoanApplication i,int loanid) {
  Optional<LoanApplication> optional=loanapplicationrepository.findById(loanid);
  LoanApplication obj=null;
  if(optional.isPresent())
  {
   obj=optional.get();
   obj.setLoanId(i.getLoanId());
   obj.setLoantype(i.getLoantype());
   obj.setApplicantName(i.getApplicantName());
   obj.setApplicantAddress(i.getApplicantAddress());
   obj.setApplicantMobile(i.getApplicantMobile());
   obj.setApplicantEmail(i.getApplicantEmail());
   obj.setApplicantAadhaar(i.getApplicantAadhaar());
   obj.setApplicantPan(i.getApplicantPan());
   obj.setApplicantSalary(i.getApplicantSalary());
   obj.setLoanAmountRequired(i.getLoanAmountRequired());
   obj.setLoanRepaymentMonths(i.getLoanRepaymentMonths());
   loanapplicationrepository.saveAndFlush(i);
  }
  return obj;
 }
 public void deleteLoans(int i) 
 {
  loanapplicationrepository.deleteById(i);
 }

}
package com.example.EducationalLoan.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EducationalLoan.Model.LoanApplication;
import com.example.EducationalLoan.Model.Login;
import com.example.EducationalLoan.Model.User;
import com.example.EducationalLoan.Repository.LoanApplicationRepository;
import com.example.EducationalLoan.Repository.UserRepository;
import com.example.EducationalLoan.Repository.loginrepo;

@Service
public class UserService {

 @Autowired
 UserRepository userrepository;
 
 @Autowired
 loginrepo repo;
 
 @Autowired
 LoanApplicationRepository loanapplicationrepository;

 
 
 public String validateUser(String email, String password) 
 {
       String result="";
       Login u = repo.findById(email).get();
       if(u==null)
       {
        result="Invalid User";
       }
       else
       {
        if(u.getPassword().equals(password))
        {
         result="Login Success";
        }
       
       else
       {
        result="Login failed";
       }
       }
       return result;
 }
 public User saveDetails(User u)
 {
  return userrepository.save(u);
 }
 public List<LoanApplication> getAllLoans()
 {
  List<LoanApplication>LoanApplicationModelList=loanapplicationrepository.findAll();
  return LoanApplicationModelList;
 }
    public LoanApplication getLoan(int loanid)
    {
     LoanApplication loan=loanapplicationrepository.findById(loanid).get();
     return loan;
    }
 public User getProfile(int id) {
  
  User user=userrepository.findById(id).get();
  return user;
 }
 public  User updateProfile(User i,int id) {
  Optional<User> optional=userrepository.findById(id);
  User obj=null;
  if(optional.isPresent())
  {
   obj=optional.get();
   obj.setId(i.getId());
   obj.setEmail(i.getEmail());
   obj.setPassword(i.getPassword());
   obj.setUsername(i.getUsername());
   obj.setMobileNumber(i.getMobileNumber());
   obj.setUserRole(i.getUserRole());
   userrepository.saveAndFlush(i);
  }
  return obj;
 }
 public void deleteProfile(int i) 
 {
  userrepository.deleteById(i);
 }

}
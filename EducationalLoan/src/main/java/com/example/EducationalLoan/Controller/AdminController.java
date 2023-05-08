package com.example.EducationalLoan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EducationalLoan.Model.LoanApplication;
import com.example.EducationalLoan.Service.AdminService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/admin")
@CrossOrigin 
public class AdminController{
 
 @Autowired
 AdminService adminservice;
 @Tag(name = "Post",description = "post data")
 @PostMapping("/saveallloans")
 public LoanApplication saveDetails(@RequestBody LoanApplication l ) {
  return adminservice.saveDetails(l);
 }
 @Tag(name = "Get",description = "get data")
 @GetMapping("/getallloans")
 public List<LoanApplication>getAllLoans()
 {
  List<LoanApplication>LoanApplicationModelList=adminservice.getAllLoans();
  return LoanApplicationModelList;
 }
 @Tag(name = "Put",description = "update data")
 @PutMapping("/updateloans/{loanid}")
 public  LoanApplication updateLoans(@RequestBody LoanApplication i,@PathVariable("loanid") int loanid)
 { 
  return adminservice.updateLoans(i,loanid);
 }
 @Tag(name = "Delete",description = "delete data")
 @DeleteMapping("deletealoans/{id}")
 public void deleteLoans(@PathVariable("id") int id) 
 {
  adminservice.deleteLoans(id);
 }
}

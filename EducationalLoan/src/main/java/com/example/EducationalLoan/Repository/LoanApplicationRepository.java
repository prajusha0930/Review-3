package com.example.EducationalLoan.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EducationalLoan.Model.LoanApplication;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication,Integer> {

   Optional<LoanApplication> findById(Integer loanid);
}





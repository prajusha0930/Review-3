package com.example.EducationalLoan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EducationalLoan.Model.Login;

@Repository
public interface loginrepo extends JpaRepository<Login, String> {

}

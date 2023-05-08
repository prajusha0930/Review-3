package com.example.EducationalLoan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EducationalLoan.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

}
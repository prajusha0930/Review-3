package com.example.EducationalLoan.Controller;

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
import com.example.EducationalLoan.Model.Login;
import com.example.EducationalLoan.Model.User;
import com.example.EducationalLoan.Service.UserService;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userservice;

    @PostMapping("/login")
    public String validateUser(@RequestBody Login l) {
        return userservice.validateUser(l.getEmail(), l.getPassword());
    }

    @PostMapping("/signup")
    public User saveDetails(@RequestBody User u) {
        return userservice.saveDetails(u);
    }

    @GetMapping("/getloan/{id}")
    public LoanApplication getLoan(@PathVariable int id) {
        return userservice.getLoan(id);
    }

    @GetMapping("/getprofile/{id}")
    public User getProfile(@PathVariable int id) {
        return userservice.getProfile(id);
    }

    @PutMapping("/updateprofile/{id}")
    public User updateProfile(@RequestBody User i, @PathVariable("id") int id) {
        return userservice.updateProfile(i, id);
    }

    @DeleteMapping("/deleteprofile/{id}")
    public void deleteProfile(@PathVariable("id") int id) {
        userservice.deleteProfile(id);
    }

}

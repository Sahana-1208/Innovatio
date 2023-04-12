package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.LoginModel;
import com.example.demo.repository.LoginRepo;

@Service
public class LoginService {
	@Autowired
	LoginRepo repository;
	
	public String add(LoginModel login) {
		repository.save(login);
		return "Successfully registered";
	}
}

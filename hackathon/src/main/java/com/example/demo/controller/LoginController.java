package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LoginModel;
import com.example.demo.service.LoginService;

@RestController
@RequestMapping("/register")
public class LoginController {
	@Autowired
	LoginService service;
	
	@CrossOrigin
	@PostMapping("")
	public String register(@RequestBody LoginModel login) {
		service.add(login);
		return "Successfully registered";
	}
	
}

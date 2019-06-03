package com.appsdeveloperblog.photoapp.api.users.ui.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appsdeveloperblog.photoapp.api.users.model.CreateuserRequestModel;

@RestController
@RequestMapping("/users")
public class UsersController {

	@Autowired
	private Environment env;
	
	@GetMapping("/status/check")
	public String status() {
		return "working port: " + env.getProperty("local.server.port");
	}
	
	@PostMapping
	public String createUser(@Valid @RequestBody CreateuserRequestModel userDetails) {
		return "create user method is called";
	}
}

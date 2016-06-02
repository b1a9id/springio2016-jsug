package com.example.web.controller;

import com.example.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users/new")
public class UserCreateController {

	@Autowired
	UserService userService;

	@GetMapping
	public String input() {
		return "user/create";
	}

}

package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserSearchController {

	@GetMapping
	public String search() {
		return "user/list";
	}
}

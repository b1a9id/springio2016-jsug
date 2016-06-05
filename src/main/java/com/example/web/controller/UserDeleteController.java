package com.example.web.controller;

import com.example.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users/delete/{id}")
public class UserDeleteController {

	@Autowired
	UserService userService;

	@DeleteMapping
	public String delete(@PathVariable Long id) {
		userService.deleteUser(id);
		return "redirect:/";
	}
}

package com.example.web.controller;

import com.example.core.entity.User;
import com.example.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.parsing.NullSourceExtractor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Objects;
import java.util.Optional;

@Controller
@RequestMapping("/users/delete/{id}")
public class UserDeleteController {

	@Autowired
	UserService userService;

	@DeleteMapping
	public String delete(
			@PathVariable Long id,
			RedirectAttributes redirectAttributes) {
		String deletedUser = userService.deleteUser(id);
		deletedUser = userService.searchUser(id) == null ? deletedUser : null;
		redirectAttributes.addFlashAttribute("deletedUser", deletedUser);
		return "redirect:/users";
	}
}

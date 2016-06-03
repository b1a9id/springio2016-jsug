package com.example.web.controller;

import com.example.core.entity.User;
import com.example.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/users/new")
public class UserCreateController {

	public static final String FORM_MODEL_KEY = "form";

	@Autowired
	UserService userService;

	@ModelAttribute(FORM_MODEL_KEY)
	public UserCreateForm setupUserCreateForm() {
		return new UserCreateForm();
	}

	@GetMapping
	public String input(Model model) {
		UserCreateForm form = (UserCreateForm) model.asMap().get(FORM_MODEL_KEY);
		model.addAttribute("form", form);
		return "user/create";
	}

	@PostMapping
	public String save(
			@Validated @ModelAttribute(FORM_MODEL_KEY) UserCreateForm form,
			RedirectAttributes redirectAttributes) {
		User savedUser;
		savedUser = userService.createUser(form.toUserCreateRequest());

		return "redirect:/users";
	}
}

package com.example.web.controller;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
public class UserCreateForm implements Serializable {

	@NotNull
	private String name;

	@Email
	private String email;

	private int age;
}

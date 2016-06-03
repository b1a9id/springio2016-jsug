package com.example.web.controller;

import com.example.core.model.UserCreateRequest;
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

	private Integer age;

	public UserCreateRequest toUserCreateRequest() {
		UserCreateRequest request = new UserCreateRequest();
		request.setName(getName());
		request.setEmail(getEmail());
		request.setAge(getAge());
		return request;
	}
}

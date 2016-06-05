package com.example.web.controller;

import com.example.core.entity.User;
import com.example.core.model.UserUpdateRequest;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
public class UserEditForm implements Serializable {

	@NotNull
	private String name;

	@Email
	private String email;

	private Integer age;

	public UserEditForm() {
	}

	public UserEditForm(User user) {
		this.name = user.getName();
		this.email = user.getEmail();
		this.age = user.getAge();
	}

	public UserUpdateRequest toUserUpdateRequest() {
		UserUpdateRequest request = new UserUpdateRequest();
		request.setName(getName());
		request.setEmail(getEmail());
		request.setAge(getAge());
		return request;
	}
}

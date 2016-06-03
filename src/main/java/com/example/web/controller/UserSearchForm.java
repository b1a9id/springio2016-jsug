package com.example.web.controller;

import com.example.core.model.UserSearchRequest;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class UserSearchForm implements Serializable {

	private String name;

	private Integer ageStart;

	private Integer ageEnd;

	public UserSearchRequest toUserSearchRequest() {
		UserSearchRequest request = new UserSearchRequest();
		request.setName(getName());
		request.setAgeStart(getAgeStart());
		request.setAgeEnd(getAgeEnd());
		return request;
	}
}

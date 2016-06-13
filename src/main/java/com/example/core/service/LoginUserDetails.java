package com.example.core.service;

import com.example.core.entity.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.authority.AuthorityUtils;

/**
 * Created by uchitate on 2016/06/12.
 */
@Getter
@Setter
public class LoginUserDetails extends org.springframework.security.core.userdetails.User {

	private final User user;

	public LoginUserDetails(User user) {

		super(user.getName(), user.getPassword(), AuthorityUtils.createAuthorityList("ROLE_USER"));
		this.user = user;
	}
}

package com.example.core.repository;

import com.example.core.entity.User;
import com.example.core.model.UserSearchRequest;

import java.util.List;

public interface UserRepositoryCustom {

	List<User> search(UserSearchRequest request);
}

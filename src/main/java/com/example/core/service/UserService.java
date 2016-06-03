package com.example.core.service;

import com.example.core.entity.User;
import com.example.core.model.UserCreateRequest;
import com.example.core.model.UserSearchRequest;
import com.example.core.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public List<User> allUsers() {
		return userRepository.findAll();
	}

	public List<User> searchUsers(UserSearchRequest request) {
		return userRepository.search(request);
	}

	public User createUser(UserCreateRequest request) {
		User user = new User();
		user.setName(request.getName());
		user.setEmail(request.getEmail());
		user.setAge(request.getAge());
		return userRepository.saveAndFlush(user);
	}

	public void deleteUser(Long id){
		User user = userRepository.findByid(id);
		userRepository.delete(user);
	}
}

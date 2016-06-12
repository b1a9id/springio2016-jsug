package com.example.core.service;

import com.example.core.entity.User;
import com.example.core.model.UserCreateRequest;
import com.example.core.model.UserSearchRequest;
import com.example.core.model.UserUpdateRequest;
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

	public User searchUser(long id) {
		return userRepository.findById(id);
	}

	public User createUser(UserCreateRequest request) {
		User user = new User();
		user.setName(request.getName());
		user.setEmail(request.getEmail());
		user.setAge(request.getAge());
		user.setGender(request.getGender());
		return userRepository.saveAndFlush(user);
	}

	public User updateUser(UserUpdateRequest request, long id) {
		User user = userRepository.findById(id);
		user.setName(request.getName());
		user.setEmail(request.getEmail());
		user.setAge(request.getAge());
		user.setGender(request.getGender());

		return userRepository.saveAndFlush(user);
	}

	public String deleteUser(Long id){
		User user = userRepository.findById(id);
		userRepository.delete(user);
		return user.getName();
	}
}

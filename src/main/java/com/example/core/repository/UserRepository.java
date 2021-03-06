package com.example.core.repository;

import com.example.core.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends UserRepositoryCustom, JpaRepository<User,Long> {

	User findById(Long id);

	User findByName(String name);
}

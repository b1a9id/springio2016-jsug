package com.example.core.repository;

import com.example.core.entity.User;
import com.example.core.model.UserSearchRequest;
import org.hibernate.search.query.dsl.BooleanJunction;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepositoryCustom {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<User> search(UserSearchRequest request) {
		List<User> users;
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<User> query = builder.createQuery(User.class);
		Root<User> root = query.from(User.class);

		if (request.getName() != null) {
			query.select(root).where(builder.like(root.get("name"), "%" + request.getName() + "%"));
		}
		if (request.getAgeStart() != null && request.getAgeEnd() != null) {
			query.select(root).where(builder.between(root.get("age"), request.getAgeStart(), request.getAgeEnd()));
		}
		if (request.getGender() != null) {
			query.select(root).where(builder.equal(root.get("gender"), request.getGender()));
		}

		return entityManager.createQuery(query).getResultList();
	}
}

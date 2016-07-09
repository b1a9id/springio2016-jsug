package com.example.core.repository;

import com.example.core.entity.User;
import com.example.core.entity.User_;
import com.example.core.model.UserSearchRequest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
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

		List<Predicate> where = new ArrayList<>();
		if (request.getName() != null) {
			where.add(builder.equal(root.get(User_.name), request.getName()));
		}
		if (request.getAgeStart() != null && request.getAgeEnd() != null) {
			where.add(builder.between(root.get(User_.age), request.getAgeStart(), request.getAgeEnd()));
		}
		if (request.getGender() != null) {
			where.add(builder.equal(root.get(User_.gender), request.getGender()));
		}

		query.where(where.toArray(new Predicate[where.size()]));

		return entityManager.createQuery(query).getResultList();
	}
}

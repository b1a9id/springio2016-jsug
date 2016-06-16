package com.example.core.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.search.annotations.Analyze;
import org.hibernate.search.annotations.Field;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class User implements Serializable {

	public enum Gender {
		MAN, WOMAN,
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long id;

	@Column(length = 100, nullable = false)
	private String name;

	@Column(length = 100, nullable = false)
	private String password;

	@Column(length = 100, nullable = true)
	private String email;

	private Integer age;

	@Enumerated(EnumType.STRING)
	@Column(length = 10, nullable = false)
	@Field(analyze = Analyze.NO)
	private Gender gender;
}

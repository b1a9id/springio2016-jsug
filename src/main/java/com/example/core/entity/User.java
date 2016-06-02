package com.example.core.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long id;

	@Column(length = 100, nullable = false)
	private String name;

	@Column(length = 100, nullable = true)
	private String email;

	private String age;
}

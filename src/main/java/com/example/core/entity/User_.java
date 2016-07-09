package com.example.core.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public class User_ {

    public static volatile SingularAttribute<User, Long> id;
    public static volatile SingularAttribute<User, String> name;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, Integer> age;
    public static volatile SingularAttribute<User, User.Gender> gender;
}

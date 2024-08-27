package com.spring.web.dao;

import com.spring.web.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {
// find byName =introducer by CRITERIA

    public List<User> findByName(String name);

    public List<User> findByNameAndCityAndId(String name, String city, int i);

    //Jpql Query
    //Hibernate is a popular Java-based ORM (Object-Relational Mapping)
    // framework that facilitates the mapping of Java classes to database
    // tables and provides a mechanism to manage persistent data. It is widely used
    // in Java applications to interact with relational databases like
    // MySQL, PostgresSQL, Oracle, etc. Hibernate simplifies database programming
    // by handling the database operations, such as CRUD (Create, Read, Update, Delete),
    // with minimal boilerplate code.
    @Query("select u FROM User u")
    public List<User> getAllUser();
// parameterize query
    @Query("select u FROM  User u WHERE u.name =:n and u.city=:c")
    public List<User> getUserByName(@Param("n")String name,@Param("c") String city);

    //Native Query
    @Query(value = "select * from user ",nativeQuery = true)
    public List<User> getUsers();
}

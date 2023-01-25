package com.cesarmontaldi.apirestful.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cesarmontaldi.apirestful.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

} 

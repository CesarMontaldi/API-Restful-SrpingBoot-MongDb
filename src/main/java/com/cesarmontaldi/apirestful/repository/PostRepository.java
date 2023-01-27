package com.cesarmontaldi.apirestful.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cesarmontaldi.apirestful.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

} 
 
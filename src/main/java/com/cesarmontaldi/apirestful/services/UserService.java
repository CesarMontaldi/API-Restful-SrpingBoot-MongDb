package com.cesarmontaldi.apirestful.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cesarmontaldi.apirestful.domain.User;
import com.cesarmontaldi.apirestful.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll(); 
	}
}

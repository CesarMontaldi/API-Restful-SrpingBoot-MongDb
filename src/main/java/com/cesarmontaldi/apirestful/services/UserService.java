package com.cesarmontaldi.apirestful.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cesarmontaldi.apirestful.domain.User;
import com.cesarmontaldi.apirestful.repository.UserRepository;
import com.cesarmontaldi.apirestful.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll(); 
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id); 
		return obj.orElseThrow(() -> new ObjectNotFoundException("Obejeto não encontrado.")); 
	} 
}

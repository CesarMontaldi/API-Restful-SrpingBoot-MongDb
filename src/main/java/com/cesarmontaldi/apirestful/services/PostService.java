package com.cesarmontaldi.apirestful.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cesarmontaldi.apirestful.domain.Post;
import com.cesarmontaldi.apirestful.repository.PostRepository;
import com.cesarmontaldi.apirestful.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) { 
		Optional<Post> obj = repo.findById(id); 
		return obj.orElseThrow(() -> new ObjectNotFoundException("Obejeto não encontrado.")); 
	} 

	public List<Post> findByTitle(String text) {
		return repo.findByTitleContainingIgnoreCase(text);  
	}
}
 
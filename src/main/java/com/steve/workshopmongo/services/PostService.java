package com.steve.workshopmongo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.steve.workshopmongo.domain.Post;
import com.steve.workshopmongo.repository.PostRepository;
import com.steve.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repository;

	public Post findById(String id) {
		Post user =  repository.findById(id)
				.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
		return user;
	}	
}

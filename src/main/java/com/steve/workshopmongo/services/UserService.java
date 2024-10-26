package com.steve.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.steve.workshopmongo.domain.User;
import com.steve.workshopmongo.dto.UserDTO;
import com.steve.workshopmongo.repository.UserRepository;
import com.steve.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(String id) {
		User user =  repository.findById(id)
				.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
		return user;
	}
	
	public User insert(User obj) {
		return repository.insert(obj);
	}
	
	public User fromDTO(UserDTO objDTO) {
		return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
	}
}

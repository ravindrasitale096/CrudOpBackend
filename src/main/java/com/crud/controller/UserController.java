package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.domain.User;
import com.crud.repository.UserRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class UserController {
	
	@Autowired
	private UserRepository userRepository; // injecting repository reference
	
	@GetMapping("/users")
	public List<User> getUsers(){
		return userRepository.findAll();
	}
	
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable Long id){
		return userRepository.findOne(id);
	}
	
	@DeleteMapping("/user/{id}")
	public boolean deleteUser(@PathVariable Long id){
		 userRepository.delete(id);
		 return true;
	}
	
	@PostMapping("/user")
	public User createUser(@RequestBody User user){
		System.out.println(user);
		return userRepository.save(user);
	}
	
	@PutMapping("/user")
	public User updateUser(@RequestBody User user){
		return userRepository.save(user);
	}
	
	
}

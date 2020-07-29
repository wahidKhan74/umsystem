package com.simplilearn.ums.umsystem.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.ums.umsystem.model.User;
import com.simplilearn.ums.umsystem.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserResource {
	
	@Autowired
	UserRepository userRepo;
	
	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		return  userRepo.save(user);		
	}
	
	@GetMapping("/users")
	public List<User> getUsers() {
		return  userRepo.findAll();		
	}
}

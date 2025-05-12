package com.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepo userRepo;
	
	@PostMapping("/add")
	public User saveUser(@RequestBody User user)
	{
		return userRepo.save(user);
	}
	
	@GetMapping("/all")
	public List<User> getAll()
	{
		return userRepo.findAll();
	}
	
	@GetMapping("/new/api")
	public String newApi(String api)
	{
		return "This is new API";
	}
	
	

}

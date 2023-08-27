package com.learning.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.learning.springboot.model.User;

@Service
public class UserService {
	private List<User> users = new ArrayList<>();
	
	public UserService() {
		users.add(new User(UUID.randomUUID().toString(),"User1", "user1@email.com"));
		users.add(new User(UUID.randomUUID().toString(),"User2", "user2@email.com"));
		users.add(new User(UUID.randomUUID().toString(),"User3", "user3@email.com"));
		users.add(new User(UUID.randomUUID().toString(),"User4", "user4@email.com"));
	}
	
	public List<User> getUsers(){
		return users;
	}
}

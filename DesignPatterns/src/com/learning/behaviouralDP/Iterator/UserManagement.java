package com.learning.behaviouralDP.Iterator;

import java.util.ArrayList;
import java.util.List;

public class UserManagement {
	List<User> users = new ArrayList<>();
	public void addUser(User user) {
		users.add(user);
	}
	
	public List<User> getUsers(){
		return users;
	}

	public MyIterator getIterator() {
		return new MyIteratorImpl(users);
	}
}

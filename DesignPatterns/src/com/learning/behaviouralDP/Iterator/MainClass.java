package com.learning.behaviouralDP.Iterator;



public class MainClass {
	public static void main(String[] args) {
			
		UserManagement userManagement = new UserManagement();
		
		userManagement.addUser(new User("Temp1", "temp1@email.com"));
		userManagement.addUser(new User("Temp2", "temp2@email.com"));
		userManagement.addUser(new User("Temp3", "temp3@email.com"));
		userManagement.addUser(new User("Temp4", "temp4@email.com"));
		
		MyIterator iterator = userManagement.getIterator();
		while(iterator.hasNext()) {
			User user = (User) iterator.next();
			System.out.println(user.getName());
		}
	}
}

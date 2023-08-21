package com.learning.creationalDP.Builder;



public class MainClass {
	public static void main(String[] args) {
		User user1 = new User.UserBuilder()
				.setUserId("Temp1")
				.setUserContact("TempContact")
				.setUserName("Temp Name")
				.build();
		User user2 = User.UserBuilder.builder()
				.setUserId("Temp2")
				.setUserContact("TempContact")
				.setUserName("Temp Name")
				.build();
		System.out.println(user1);
		System.out.println(user2);
	}
}

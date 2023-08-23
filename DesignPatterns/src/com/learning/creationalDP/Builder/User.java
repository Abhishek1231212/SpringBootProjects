package com.learning.creationalDP.Builder;

public class User {
	private final String userId;
	private final String userName;
	private final String userContact;

	public User(UserBuilder builder) {
		super();
		this.userId = builder.userId;
		this.userName = builder.userName;
		this.userContact = builder.userContact;
	}
	

	public String getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserContact() {
		return userContact;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userContact=" + userContact + "]";
	}

	static class UserBuilder {
		private String userId;
		private String userName;
		private String userContact;
		
		public UserBuilder() {}

		public static UserBuilder builder() {
			return new UserBuilder();
		}
		public UserBuilder setUserId(String userId) {
			this.userId = userId;
			return this;
		}

		public UserBuilder setUserName(String userName) {
			this.userName = userName;
			return this;
		}

		public UserBuilder setUserContact(String userContact) {
			this.userContact = userContact;
			return this;
		}
		
		public User build() {
			User user = new User(this);
			return user;
		}

	}
}

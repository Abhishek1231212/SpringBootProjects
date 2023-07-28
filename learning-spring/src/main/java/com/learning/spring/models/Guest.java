package com.learning.spring.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="guest")
public class Guest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long guest_id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="address")
	private String address;
	
	@Column(name="country")
	private String country;
	
	@Column(name="state")
	private String state;
	
	@Column(name="phone_number")
	private String phone_number;
	
	public Guest() {}

	public Guest(long guest_id, String firstName, String lastName, String email, String address, String country,
			String state, String phone_number) {
		super();
		this.guest_id = guest_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.country = country;
		this.state = state;
		this.phone_number = phone_number;
	}

	public long getGuest_id() {
		return guest_id;
	}

	public void setGuest_id(long guest_id) {
		this.guest_id = guest_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	@Override
	public String toString() {
		return "Guest [guest_id=" + guest_id + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", address=" + address + ", country=" + country + ", state=" + state + ", phone_number="
				+ phone_number + "]";
	}
}

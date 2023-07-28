package com.learning.spring.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.spring.models.Guest;
import com.learning.spring.repositories.GuestRepository;

@Service
public class GuestService {
	
	@Autowired
	private GuestRepository guestRepository;
	
	public List<Guest> getAllGuests(){
		return guestRepository.findAll();
	}
	
	public Guest getGuestByGuestNumber(long guestNumber) {
		Guest guest = guestRepository.findById(guestNumber).get();
		return guest;
	}
	public void saveGuest(Guest guest) {	
		guestRepository.save(guest);
	}
	
	public String removeGuest(long guestNumber) {
		Guest guest = guestRepository.findById(guestNumber).get();
		if(guest == null)
			return "Guest is not available to remove";
		guestRepository.delete(guest);
		return "Guest Removed";
	}
	
	public void updateGuest(Guest guest) {
		guestRepository.save(guest);
	}
}

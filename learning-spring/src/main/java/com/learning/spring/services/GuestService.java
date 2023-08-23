package com.learning.spring.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.learning.spring.exceptions.ResourceNotFoundException;
import com.learning.spring.models.Guest;
import com.learning.spring.repositories.GuestRepository;

import ch.qos.logback.core.net.ObjectWriter;

@Service
public class GuestService {
	
	@Autowired
	private GuestRepository guestRepository;
	ObjectMapper objectMapper = new ObjectMapper();
	com.fasterxml.jackson.databind.ObjectWriter objectWriter = objectMapper.writer();
	
	
	
	public List<Guest> getAllGuests(){
		return guestRepository.findAll();
	}
	
	public Guest getGuestByGuestNumber(long guestNumber) throws ResourceNotFoundException {
		Optional<Guest> guest = guestRepository.findById(guestNumber);
		if(guest.isEmpty())
			throw new ResourceNotFoundException("No Guest of the id:" + guestNumber);
		
		return guest.get();
	}
	public String saveGuest(Guest guest) throws JsonProcessingException {	
		Optional<Guest> existing_guest = guestRepository.findById(guest.getGuest_id());
		if(!existing_guest.isEmpty())
			return "Guest Present";
		guestRepository.save(guest);
		return objectWriter.writeValueAsString(guest);
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

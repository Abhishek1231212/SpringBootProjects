package com.learning.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.learning.spring.exceptions.ResourceNotFoundException;
import com.learning.spring.models.Guest;
import com.learning.spring.services.GuestService;

@RestController
public class GuestController {
	@Autowired
	private GuestService guestService;
	
	@GetMapping("/guests")
	public List<Guest> getAllGuests(){
		return guestService.getAllGuests();
	}
	
	@GetMapping("/guests/{guest_id}")
	public Guest getGuestById(@PathVariable long guest_id) throws ResourceNotFoundException{
		return guestService.getGuestByGuestNumber(guest_id);
	}
	
	@PostMapping("/guests")
	public String saveGuest(@RequestBody Guest guest) throws JsonProcessingException {
		return guestService.saveGuest(guest);
	}
	
	@DeleteMapping("/guests/{guest_id}")
	public String removeGuestById(@PathVariable long guest_id) {
		return guestService.removeGuest(guest_id);
	}
	
	@PutMapping("/guests")
	public void updateGuest(@RequestBody Guest guest) {
		guestService.updateGuest(guest);
	}
}

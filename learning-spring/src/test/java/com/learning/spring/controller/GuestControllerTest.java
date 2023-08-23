package com.learning.spring.controller;

import static org.hamcrest.CoreMatchers.any;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.learning.spring.controllers.GuestController;
import com.learning.spring.exceptions.ResourceNotFoundException;
import com.learning.spring.models.Guest;
import com.learning.spring.repositories.GuestRepository;
import com.learning.spring.services.GuestService;

import ch.qos.logback.core.net.ObjectWriter;

public class GuestControllerTest {
	
	
	private MockMvc mockMvc;
	
	ObjectMapper objectMapper = new ObjectMapper();
	
	com.fasterxml.jackson.databind.ObjectWriter objectWriter =objectMapper.writer();
	
	@Mock
	private GuestRepository guestRepository;
	
	@Mock
	private GuestService guestService;
	
	@InjectMocks
	private GuestController guestController;
	
	private List<Guest> guests = new ArrayList<>();
	
	private Guest guest1, guest2, guest3, guest4, guest5, guest6;
	@BeforeEach
	private void setup() {
		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(guestController).build();
		guest1 = new Guest(1l, "temp1FN", "temp1LN", "temp1@email.com", "temp1Address", "temp1Country", "temp1State", "9999999999");
		guest2 = new Guest(2l, "temp2FN", "temp2LN", "temp2@email.com", "temp2Address", "temp2Country", "temp2State", "9999999999");
		guest3 = new Guest(3l, "temp3FN", "temp3LN", "temp3@email.com", "temp3Address", "temp3Country", "temp3State", "9999999999");
		guest4 = new Guest(4l, "temp4FN", "temp4LN", "temp4@email.com", "temp4Address", "temp4Country", "temp4State", "9999999999");
		guest5 = new Guest(5l, "temp5FN", "temp5LN", "temp5@email.com", "temp5Address", "temp5Country", "temp5State", "9999999999");
		guest6 = new Guest(6l, "temp6FN", "temp6LN", "temp6@email.com", "temp6Address", "temp6Country", "temp6State", "9999999999");
		guests.add(guest1); 
		guests.add(guest2); 
		guests.add(guest3);
		guests.add(guest4);
		guests.add(guest5);
		guests.add(guest6);
	}
//	
//	@Test
//	public void testGetAllRecords_Success() throws Exception {
//		List<Guest> records = new ArrayList<>(guests);
//		System.out.println(records.size());
//		Mockito.when(guestService.getAllGuests()).thenReturn(records);
//		
//		mockMvc.perform(MockMvcRequestBuilders
//				.get("/guests")
//				.contentType(MediaType.APPLICATION_JSON))
//				.andExpect(status().isOk())
//				.andExpect(jsonPath("$[0].email", is("temp1@email.com")));
//	}
//	
//	@Test
//	public void testGetGuestById_Success() throws Exception, ResourceNotFoundException {
//		List<Guest> records = new ArrayList<>(guests);
//		System.out.println(records.size());
//		Mockito.when(guestService.getGuestByGuestNumber(records.get(0).getGuest_id())).thenReturn(guest1);
//		
//		mockMvc.perform(MockMvcRequestBuilders
//				.get("/guests/1")
//				.contentType(MediaType.APPLICATION_JSON))
//				.andExpect(status().isOk())
//				.andExpect(jsonPath("$.email", is("temp1@email.com")));
//	}
	
	@Test
	public void testCreateGuest_success() throws Exception{
		String content = objectWriter.writeValueAsString(guest1);
		Mockito.when(guestService.saveGuest(guest1)).thenReturn(content);
		//Mockito.when(guestRepository.save(guest1)).thenReturn(guest1);
		
		
		System.out.println("Content: " + content);
													
		mockMvc.perform( MockMvcRequestBuilders
				.post("/guests")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)
				.content(content))
			   .andExpect(status().isOk())
			   .andExpect(jsonPath("$", notNullValue()));
//			   .andExpect(jsonPath("$.email", is("temp1@email.com")));
				
	}
	
}



























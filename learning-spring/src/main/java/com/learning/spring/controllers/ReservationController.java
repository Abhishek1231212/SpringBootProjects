package com.learning.spring.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.spring.models.Reservation;
import com.learning.spring.services.ReservationService;
import com.learning.spring.utils.DateUtils;

@RestController
public class ReservationController {
	@Autowired
	private DateUtils dateUtils;
	
	@Autowired
	private ReservationService reservationService;
	
//	@GetMapping("/reservations")
//	public String getAllReservations(@RequestParam(value="date", required = false)String dateString, Model model){
//		Date date = this.dateUtils.createDateFromDateString(dateString);
//		List<Reservation> roomReservations = this.reservationService.getAllReservations();
//		model.addAttribute("roomReservations", roomReservations);
//		return "roomres";
//	}
	@GetMapping("/reservations")
	public List<Reservation> getAllReservations(){
		return this.reservationService.getAllReservations();
		
	}
	
	@GetMapping("/reservations/reservation_id")
	public Reservation getReservationById(@RequestParam long reservation_id) {
		return reservationService.getReservationByID(reservation_id);
	}
	
	@PostMapping("/reservations")
	public String saveReservation(@RequestBody Reservation reservation) {
		return reservationService.saveReservation(reservation);
	}
	
	@DeleteMapping("/reservations/reservation_id")
	public String removeReservationById(@RequestParam long reservation_id) {
		return reservationService.deleteReservation(reservation_id);
	}
	
	@PutMapping("/reservations")
	public void updateReservation(@RequestBody Reservation reservation) {
		reservationService.updateReservation(reservation);
	}
}

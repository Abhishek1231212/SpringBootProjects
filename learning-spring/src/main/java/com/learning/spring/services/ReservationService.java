package com.learning.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.spring.models.Guest;
import com.learning.spring.models.Reservation;
import com.learning.spring.models.Room;
import com.learning.spring.repositories.GuestRepository;
import com.learning.spring.repositories.ReservationRepository;
import com.learning.spring.repositories.RoomRepository;

@Service
public class ReservationService {

	@Autowired
	private ReservationRepository reservationRepository;

	@Autowired
	private RoomRepository roomRepository;

	@Autowired
	private GuestRepository guestRepository;

	public List<Reservation> getAllReservations() {
		return reservationRepository.findAll();
	}

	public Reservation getReservationByID(long res_id) {
		return reservationRepository.findById(res_id).get();
	}

	public String saveReservation(Reservation reservation) {
		Room room = roomRepository.findRoomByRoomNumber(reservation.getRoom_id());
		Optional<Guest> guest = guestRepository.findById(reservation.getGuest_id());
		

		if (room == null)
			return "Room Unavailable";
		if (guest.isEmpty())
			return "Guest Unavailable";

		reservationRepository.save(reservation);
		return "Reservation Done";
	}

	public String deleteReservation(long res_id) {
		Reservation reservation = reservationRepository.getById(res_id);
		if (reservation == null)
			return "Reservation unavailable";
		reservationRepository.delete(reservation);
		return "Reservation Deleted";
	}
	
	public void updateReservation(Reservation reservation) {
		reservationRepository.save(reservation);
	}
}

package com.learning.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.spring.models.Guest;
import com.learning.spring.models.Reservation;
import com.learning.spring.models.Room;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long>{
	
}

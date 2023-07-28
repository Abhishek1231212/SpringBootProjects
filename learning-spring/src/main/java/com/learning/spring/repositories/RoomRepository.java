package com.learning.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.spring.models.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{
	public Room findRoomByRoomNumber(String roomNumber);
}

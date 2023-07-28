package com.learning.spring.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.spring.models.Room;
import com.learning.spring.repositories.RoomRepository;

@Service
public class RoomService {
	
	@Autowired
	private RoomRepository roomRepository;
	
	public List<Room> getAllRooms(){
		return roomRepository.findAll();
	}
	
	public Room	getRoomByRoomNumber(String room_number) {
		Room room = roomRepository.findRoomByRoomNumber(room_number);
		return room;
	}
	public String saveRoom(Room room) {
		List<Room> rooms = roomRepository.findAll();
		for(Room room_exists : rooms) {
			if(room_exists.getRoomNumber() == room.getRoomNumber())
				return "RoomNumber Exists";
		}
		roomRepository.save(room);
		return "Room Added";
	}
	
	public String removeRoom(String roomNumber) {
		Room room = roomRepository.findRoomByRoomNumber(roomNumber);
		if(room == null)
			return "Room is not available to remove";
		roomRepository.delete(room);
		return "Room Removed";
	}
	
	public void updateRoom(Room room) {
		roomRepository.save(room);
	}
}

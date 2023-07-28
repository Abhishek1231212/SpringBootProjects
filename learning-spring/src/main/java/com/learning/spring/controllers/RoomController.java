package com.learning.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.spring.models.Room;
import com.learning.spring.services.RoomService;

@RestController
public class RoomController {
	
	
	@Autowired
	RoomService roomService;
	
	@GetMapping("/rooms")
	public List<Room> getRoom(){
		return roomService.getAllRooms();
	}
	
	@PostMapping("/rooms")
	public String saveRoom(@RequestBody Room room) {
		return roomService.saveRoom(room);
	}
	
	@DeleteMapping("/rooms/room_id")
	public String deleteRoom(@RequestParam String room_id) {
		return roomService.removeRoom(room_id);
	}
	
	@PutMapping("/rooms")
	public void updateRoom(@RequestBody Room room) {
		roomService.updateRoom(room);
	}
	
	@GetMapping("/rooms/room_number")
	public Room getRoomByRoomNumber(@RequestParam String room_number){
		System.out.println(room_number);
		return roomService.getRoomByRoomNumber(room_number);
	}
	
}

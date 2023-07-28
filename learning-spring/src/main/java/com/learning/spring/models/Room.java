package com.learning.spring.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="room")
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="room_id")
	private long id;
	@Column(name="room_name")
	private String name;
	@Column(name="room_number")
	private String roomNumber;
	@Column(name="bed_info")
	private String bedInfo;
	
	public Room() {}
	public Room(long id, String name, String roomNumber, String bedInfo) {
		super();
		this.id = id;
		this.name = name;
		this.roomNumber = roomNumber;
		this.bedInfo = bedInfo;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getBedInfo() {
		return bedInfo;
	}
	public void setBedInfo(String bedInfo) {
		this.bedInfo = bedInfo;
	}
	@Override
	public String toString() {
		return "Room [id=" + id + ", name=" + name + ", roomNumber=" + roomNumber + ", bedInfo=" + bedInfo + "]";
	}
	
	
	
}

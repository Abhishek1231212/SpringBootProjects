package com.learning.spring.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reservation")
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="reservation_id")
	private long reservation_id;
	
	@Column(name="room_id")
	private String room_id;
	
	@Column(name="guest_id")
	private long guest_id;
	
	@Column(name="res_date")
	private Date res_date;
	
	public Reservation() {}

	public Reservation(long reservation_id, String room_id, long guest_id, Date res_date) {
		super();
		this.reservation_id = reservation_id;
		this.room_id = room_id;
		this.guest_id = guest_id;
		this.res_date = res_date;
	}

	public long getReservation_id() {
		return reservation_id;
	}

	public void setReservation_id(long reservation_id) {
		this.reservation_id = reservation_id;
	}

	public String getRoom_id() {
		return room_id;
	}

	public void setRoom_id(String room_id) {
		this.room_id = room_id;
	}

	public long getGuest_id() {
		return guest_id;
	}

	public void setGuest_id(long guest_id) {
		this.guest_id = guest_id;
	}

	public Date getRes_date() {
		return res_date;
	}

	public void setRes_date(Date res_date) {
		this.res_date = res_date;
	}

	@Override
	public String toString() {
		return "Reservation [reservation_id=" + reservation_id + ", room_id=" + room_id + ", guest_id=" + guest_id
				+ ", res_date=" + res_date + "]";
	}
	
	
}

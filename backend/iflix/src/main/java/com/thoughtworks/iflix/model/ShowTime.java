package com.thoughtworks.iflix.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Showtime")
public class ShowTime 
{
	@Id
	@Column(name="time")
	private String time;
	
	@Column(name="totalSeats")
	private int totalSeats;
	
	@Column(name="availableSeats")
	private int availableSeats;
	
	@ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
	@JoinColumn(name="venue_id")
	private Venue venue; 

	public ShowTime(String time, int totalSeats, int availableSeats) {
		this.time = time;
		this.totalSeats = totalSeats;
		this.availableSeats = availableSeats;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	
	
}

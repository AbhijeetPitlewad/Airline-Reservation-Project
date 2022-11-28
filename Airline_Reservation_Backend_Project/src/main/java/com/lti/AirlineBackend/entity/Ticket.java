package com.lti.AirlineBackend.entity;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class Ticket {
	
	@Id
	private int ticketNumber;
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	private Flight flight;
	private String ClassType;
	private int seatNumber;
	private String status;
	
	@OneToOne
	private Payment payment;
	
	
}

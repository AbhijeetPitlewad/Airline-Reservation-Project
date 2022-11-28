package com.lti.AirlineBackend.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Tickets")
public class Ticket {
	@Id
	private int ticketNumber;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="userEmail")
	private User user;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="flightNumber")
	private Flight flight;
	private String ClassType;
	private int seatNumber;
	private String status;
	private Date flightDate;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="PaymentId")
	private Payment payment;

	public Ticket() {
		super();
		
	}

	public Ticket(int ticketNumber, User user, Flight flight, String classType, int seatNumber, String status,
			Date flightDate, Payment payment) {
		super();
		this.ticketNumber = ticketNumber;
		this.user = user;
		this.flight = flight;
		ClassType = classType;
		this.seatNumber = seatNumber;
		this.status = status;
		this.flightDate = flightDate;
		this.payment = payment;
	}

	public int getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public String getClassType() {
		return ClassType;
	}

	public void setClassType(String classType) {
		ClassType = classType;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "Ticket [ticketNumber=" + ticketNumber + ", user=" + user + ", flight=" + flight + ", ClassType="
				+ ClassType + ", seatNumber=" + seatNumber + ", status=" + status + ", flightDate=" + flightDate
				+ ", payment=" + payment + "]";
	}
	
	

	

	
	
	
}

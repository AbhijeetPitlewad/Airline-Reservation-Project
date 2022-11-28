package com.lti.AirlineBackend.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Flights")
public class Flight {
	
	@Id
	private int flightNumber;
	private String flightName;
	private String flightFrom;
    private String flightTo;
	private LocalDate flightArrival;
	private LocalDate flightDeparture;
	private int flighDuration;
	private int NumberOfEs; //Economy Seats
	private int NumberOfBs; //Bussiness Seats
	private int EsPrice; //economy seats
	private int BsPrice; //Bussiness Seats
	
	public Flight() {
		super();
	}

	public Flight(int flightNumber, String flightName, String flightFrom, String flightTo, LocalDate flightArrival,
			LocalDate flightDeparture, int flighDuration, int numberOfEs, int numberOfBs, int esPrice, int bsPrice) {
		super();
		this.flightNumber = flightNumber;
		this.flightName = flightName;
		this.flightFrom = flightFrom;
		this.flightTo = flightTo;
		this.flightArrival = flightArrival;
		this.flightDeparture = flightDeparture;
		this.flighDuration = flighDuration;
		NumberOfEs = numberOfEs;
		NumberOfBs = numberOfBs;
		EsPrice = esPrice;
		BsPrice = bsPrice;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getFlightFrom() {
		return flightFrom;
	}

	public void setFlightFrom(String flightFrom) {
		this.flightFrom = flightFrom;
	}

	public String getFlightTo() {
		return flightTo;
	}

	public void setFlightTo(String flightTo) {
		this.flightTo = flightTo;
	}

	public LocalDate getFlightArrival() {
		return flightArrival;
	}

	public void setFlightArrival(LocalDate flightArrival) {
		this.flightArrival = flightArrival;
	}

	public LocalDate getFlightDeparture() {
		return flightDeparture;
	}

	public void setFlightDeparture(LocalDate flightDeparture) {
		this.flightDeparture = flightDeparture;
	}

	public int getFlighDuration() {
		return flighDuration;
	}

	public void setFlighDuration(int flighDuration) {
		this.flighDuration = flighDuration;
	}

	public int getNumberOfEs() {
		return NumberOfEs;
	}

	public void setNumberOfEs(int numberOfEs) {
		NumberOfEs = numberOfEs;
	}

	public int getNumberOfBs() {
		return NumberOfBs;
	}

	public void setNumberOfBs(int numberOfBs) {
		NumberOfBs = numberOfBs;
	}

	public int getEsPrice() {
		return EsPrice;
	}

	public void setEsPrice(int esPrice) {
		EsPrice = esPrice;
	}

	public int getBsPrice() {
		return BsPrice;
	}

	public void setBsPrice(int bsPrice) {
		BsPrice = bsPrice;
	}

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", flightName=" + flightName + ", flightFrom=" + flightFrom
				+ ", flightTo=" + flightTo + ", flightArrival=" + flightArrival + ", flightDeparture=" + flightDeparture
				+ ", flighDuration=" + flighDuration + ", NumberOfEs=" + NumberOfEs + ", NumberOfBs=" + NumberOfBs
				+ ", EsPrice=" + EsPrice + ", BsPrice=" + BsPrice + "]";
	}
	
	
	
	
	

}

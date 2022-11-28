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
	private String flightArrival;
	private String flightDeparture;
	private int flighDuration;
	private int numberOfEs; //Economy Seats
	private int numberOfBs; //Bussiness Seats
	private int esPrice; //economy seats
	private int bsPrice; //Bussiness Seats
	
	public Flight() {
		super();
	}

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", flightName=" + flightName + ", flightFrom=" + flightFrom
				+ ", flightTo=" + flightTo + ", flightArrival=" + flightArrival + ", flightDeparture=" + flightDeparture
				+ ", flighDuration=" + flighDuration + ", numberOfEs=" + numberOfEs + ", numberOfBs=" + numberOfBs
				+ ", esPrice=" + esPrice + ", bsPrice=" + bsPrice + "]";
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

	public String getFlightArrival() {
		return flightArrival;
	}

	public void setFlightArrival(String flightArrival) {
		this.flightArrival = flightArrival;
	}

	public String getFlightDeparture() {
		return flightDeparture;
	}

	public void setFlightDeparture(String flightDeparture) {
		this.flightDeparture = flightDeparture;
	}

	public int getFlighDuration() {
		return flighDuration;
	}

	public void setFlighDuration(int flighDuration) {
		this.flighDuration = flighDuration;
	}

	public int getNumberOfEs() {
		return numberOfEs;
	}

	public void setNumberOfEs(int numberOfEs) {
		this.numberOfEs = numberOfEs;
	}

	public int getNumberOfBs() {
		return numberOfBs;
	}

	public void setNumberOfBs(int numberOfBs) {
		this.numberOfBs = numberOfBs;
	}

	public int getEsPrice() {
		return esPrice;
	}

	public void setEsPrice(int esPrice) {
		this.esPrice = esPrice;
	}

	public int getBsPrice() {
		return bsPrice;
	}

	public void setBsPrice(int bsPrice) {
		this.bsPrice = bsPrice;
	}

	public Flight(int flightNumber, String flightName, String flightFrom, String flightTo, String flightArrival,
			String flightDeparture, int flighDuration, int numberOfEs, int numberOfBs, int esPrice, int bsPrice) {
		super();
		this.flightNumber = flightNumber;
		this.flightName = flightName;
		this.flightFrom = flightFrom;
		this.flightTo = flightTo;
		this.flightArrival = flightArrival;
		this.flightDeparture = flightDeparture;
		this.flighDuration = flighDuration;
		this.numberOfEs = numberOfEs;
		this.numberOfBs = numberOfBs;
		this.esPrice = esPrice;
		this.bsPrice = bsPrice;
	}

	
	

}

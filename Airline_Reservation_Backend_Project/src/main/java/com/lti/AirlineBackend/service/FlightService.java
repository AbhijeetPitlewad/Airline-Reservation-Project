package com.lti.AirlineBackend.service;

import java.util.List;

import com.lti.AirlineBackend.entity.Flight;

public interface FlightService {

	Flight addFlight(Flight flightNumber);

	Flight getFlightByflightNumber(int flightNumber);

	List<Flight> getAllFlights();

	Boolean deleteFlight(int flightNumber);

	List<Flight> searchOneWayFlights(String from, String to);

}

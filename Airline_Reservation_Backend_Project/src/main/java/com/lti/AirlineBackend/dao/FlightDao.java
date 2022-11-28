package com.lti.AirlineBackend.dao;

import java.util.List;

import com.lti.AirlineBackend.entity.Flight;

public interface FlightDao {

	Flight addFlight(Flight flight);

	Flight getFlightByflightNumber(int flightNumber);

	List<Flight> getAllFlights();

	Boolean deleteFlight(int flightNumber);

	List<Flight> searchOneWayFlights(String from, String to);

}

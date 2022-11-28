package com.lti.AirlineBackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.AirlineBackend.dao.FlightDao;
import com.lti.AirlineBackend.entity.Flight;

@Service("flightService")
public class FlightServiceImpl implements FlightService {

	@Autowired
	FlightDao flightdao;

	@Override
	public Flight addFlight(Flight flight) {
		Flight flight1=flightdao.addFlight(flight);
		return flight1;
	}

	@Override
	public Flight getFlightByflightNumber(int flightNumber) {
		Flight flight1=flightdao.getFlightByflightNumber(flightNumber);
		return flight1;
	}

	@Override
	public List<Flight> getAllFlights() {
		List<Flight> flightList=flightdao.getAllFlights();
		return flightList;
	}

	

	@Override
	public Boolean deleteFlight(int flightNumber) {
		Boolean res=flightdao.deleteFlight(flightNumber);
		return res;
	}

	@Override
	public List<Flight> searchOneWayFlights(String from, String to) {
		List<Flight> flightList=flightdao.searchOneWayFlights(from,to);
		return flightList;
	}

	
	
	

	

}

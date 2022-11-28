package com.lti.AirlineBackend.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.AirlineBackend.entity.Flight;
import com.lti.AirlineBackend.service.FlightService;


@RestController
@RequestMapping("flight")
public class FlightController {
	
	@Autowired
	FlightService flightService;
	
	@PostMapping("/")
	public Flight addFlight(@RequestBody Flight flight) {
		
		Flight flight1=flightService.addFlight(flight);
		return flight1;
		
	}
	
	@GetMapping("/{flightNumber}")
	public Flight getFlightByflightNumber(@PathVariable int flightNumber) {
		Flight flight1=flightService.getFlightByflightNumber(flightNumber);
		return flight1;
	}
	
	@GetMapping("/")
	public List<Flight> getAllFlights(){
		List<Flight> flightList=flightService.getAllFlights();
		return flightList;
	}
	
	
	@DeleteMapping("/{flightNumber}")
	public Boolean deleteFlight(@PathVariable int flightNumber) {
		Boolean res=flightService.deleteFlight(flightNumber);
		return res;
	}
	
	//http://localhost:8282/flight/search?from=Achalpur&to=Ahiri
	@GetMapping("/search")
	public List<Flight> searchOneWayFlights(@RequestParam String from,@RequestParam String to ){
		List<Flight> flightList=flightService.searchOneWayFlights(from,to);
		return flightList;
	}

}

////http://localhost:8088/AirlineApp/flights?from=Achalpur&to=Ahiri&departureDate=2022-09-02&returnDate=undefined&passengerCount=34
//	@GetMapping("/flights/search")
//	@ResponseBody
//	public List<Flight> searchFlights(@RequestParam String from, String to, String departureDate, String returnDate, String passengerCount ){
//		List<Flight> flights;
//		
//		if(returnDate.equals("undefined")) {
//			flights = fService.searchOneWayFlights(from,to,LocalDate.parse(departureDate));
//		}else {
//			flights = fService.searchRoundTripFlights(from,to,LocalDate.parse(departureDate), LocalDate.parse(returnDate));
//		}
//		
//		List<Flight> filteredFlights = new ArrayList<>();
//		
//		for(Flight f : flights) {
//			List<SeatBooking> seatBookings = sbService.getBookingsFor(f.getFlight_id(),"available");
//			if(seatBookings.size() >= Integer.parseInt(passengerCount)) {
//				filteredFlights.add(f);
//			}
//		}
//		// filter by passenger count
//		return flights;
//	}

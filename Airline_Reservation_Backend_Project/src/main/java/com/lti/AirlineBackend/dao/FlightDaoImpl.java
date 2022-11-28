package com.lti.AirlineBackend.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.AirlineBackend.entity.Flight;

@Repository
public class FlightDaoImpl implements  FlightDao{

	@PersistenceContext
	EntityManager em;
	
	@Override
	@Transactional
	public Flight addFlight(Flight flight) {
		em.persist(flight);
		return flight;
	}

	@Override
	public Flight getFlightByflightNumber(int flightNumber) {
		Flight flight1=em.find(Flight.class, flightNumber);
		return flight1;
	}

	@Override
	public List<Flight> getAllFlights() {
		Query qry=em.createQuery("select f from Flight f");
		List<Flight> flightList=qry.getResultList();
		return flightList;
	}

	@Override
	@Transactional
	public Boolean deleteFlight(int flightNumber) {
		Flight flight=em.find(Flight.class, flightNumber);
		em.remove(flight);
		
		return true;
	}

	@Override
	public List<Flight> searchOneWayFlights(String from, String to) {
		Query qry= em.createQuery("select f from Flight f where f.flightFrom= :from and f.flightTo= :to");
		qry.setParameter("from", from);
		qry.setParameter("to", to);
		List<Flight> flightList=qry.getResultList();
		return flightList;
	}
	
	

}

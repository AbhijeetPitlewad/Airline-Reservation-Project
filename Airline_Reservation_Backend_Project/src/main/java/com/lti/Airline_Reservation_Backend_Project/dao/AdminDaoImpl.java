package com.lti.Airline_Reservation_Backend_Project.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.Airline_Reservation_Backend_Project.entity.Admin;

@Repository
public class AdminDaoImpl implements AdminDao{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Admin findAdminByUserName(String adminUserName) {
		Admin admin = em.find(Admin.class,adminUserName );
		return admin;
	}

	@Override
	@Transactional
	public String addAdmin(Admin admin) {
		em.persist(admin);
		return admin.getAdminUserName();
	}
	
}

package com.lti.Airline_Reservation_Backend_Project.dao;

import com.lti.Airline_Reservation_Backend_Project.entity.Admin;


public interface AdminDao {
	
	public Admin findAdminByUserName(String adminUserName);
	public String addAdmin(Admin admin);
	
}

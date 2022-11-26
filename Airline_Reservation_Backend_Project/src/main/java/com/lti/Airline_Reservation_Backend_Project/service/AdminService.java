package com.lti.Airline_Reservation_Backend_Project.service;

import com.lti.Airline_Reservation_Backend_Project.entity.Admin;

public interface AdminService {

	public Admin findAdminByUserName(String adminUserName);
	public String addAdmin(Admin admin);
}

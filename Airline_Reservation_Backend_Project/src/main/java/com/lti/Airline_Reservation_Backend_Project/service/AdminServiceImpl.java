package com.lti.Airline_Reservation_Backend_Project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.Airline_Reservation_Backend_Project.dao.AdminDao;
import com.lti.Airline_Reservation_Backend_Project.entity.Admin;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminDao admindao;
	
	@Override
	public Admin findAdminByUserName(String adminUserName) {
		Admin admin= admindao.findAdminByUserName(adminUserName);
		return admin;
	}

	@Override
	public String addAdmin(Admin admin) {
		String adminUserName=admindao.addAdmin(admin);
		return adminUserName;
	}

}

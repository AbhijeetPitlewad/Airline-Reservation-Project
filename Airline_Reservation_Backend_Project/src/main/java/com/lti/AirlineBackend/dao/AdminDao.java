package com.lti.AirlineBackend.dao;

import com.lti.AirlineBackend.entity.Admin;


public interface AdminDao {
	
	public Admin findAdminByUserName(String adminUserName);
	public String addAdmin(Admin admin);
	
}

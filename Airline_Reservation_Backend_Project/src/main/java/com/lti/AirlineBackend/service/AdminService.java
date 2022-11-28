package com.lti.AirlineBackend.service;

import com.lti.AirlineBackend.entity.Admin;

public interface AdminService {

	public Admin findAdminByUserName(String adminUserName);
	public String addAdmin(Admin admin);
}

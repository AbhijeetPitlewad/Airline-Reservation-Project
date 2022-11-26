package com.lti.Airline_Reservation_Backend_Project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Admins")
public class Admin {
	
	
	@Id
	private String adminUserName;
	private String adminPassword;
	private String adminName;
	
	public Admin() {
		super();		
	}

	public Admin(String adminUserName, String adminPassword, String adminName) {
		super();
		this.adminUserName = adminUserName;
		this.adminPassword = adminPassword;
		this.adminName = adminName;
	}

	public String getAdminUserName() {
		return adminUserName;
	}

	public void setAdminUserName(String adminUserName) {
		this.adminUserName = adminUserName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	@Override
	public String toString() {
		return "Admin [adminUserName=" + adminUserName + ", adminPassword=" + adminPassword + ", adminName=" + adminName
				+ "]";
	}
	
	
	
	
}

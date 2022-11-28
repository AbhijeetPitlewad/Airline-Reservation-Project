package com.lti.AirlineBackend.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "Users")
public class User {
	
	@Id
	private String userEmail;
	private String userTitle;
	private String userFirstName;
	private String userLastName;	
	private Date Dob;
	private String userPassword;
	private String userPhone;
	private String que;
	private String ans;
	
	public User() {
		super();
	}

	public User(String userEmail, String userTitle, String userFirstName, String userLastName, Date dob,
			String userPassword, String userPhone, String que, String ans) {
		super();
		this.userEmail = userEmail;
		this.userTitle = userTitle;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		Dob = dob;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
		this.que = que;
		this.ans = ans;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserTitle() {
		return userTitle;
	}

	public void setUserTitle(String userTitle) {
		this.userTitle = userTitle;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public Date getDob() {
		return Dob;
	}

	public void setDob(Date dob) {
		Dob = dob;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getQue() {
		return que;
	}

	public void setQue(String que) {
		this.que = que;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	@Override
	public String toString() {
		return "User [userEmail=" + userEmail + ", userTitle=" + userTitle + ", userFirstName=" + userFirstName
				+ ", userLastName=" + userLastName + ", Dob=" + Dob + ", userPassword=" + userPassword + ", userPhone="
				+ userPhone + ", que=" + que + ", ans=" + ans + "]";
	}
	
	
	
	
	

}

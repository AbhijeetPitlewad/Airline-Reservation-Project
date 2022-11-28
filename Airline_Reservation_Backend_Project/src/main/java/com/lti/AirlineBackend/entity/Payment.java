package com.lti.AirlineBackend.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment {
	
	@Id
	private int PaymentId;
	private double Amount;
	private Date date;
}

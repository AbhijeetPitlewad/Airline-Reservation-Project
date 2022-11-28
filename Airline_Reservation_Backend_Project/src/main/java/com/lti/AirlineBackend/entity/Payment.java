package com.lti.AirlineBackend.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "Payments")
public class Payment {

	@Id
	@Column(name = "payment_Id")
	private int payment_Id;
	private double amount;
//	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date paymentDate;

	public Payment() {
		super();

	}

	public int getPayment_Id() {
		return payment_Id;
	}

	public void setPayment_Id(int payment_Id) {
		this.payment_Id = payment_Id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		amount = amount;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Payment(int payment_Id, double amount, Date paymentDate) {
		super();
		this.payment_Id = payment_Id;
		amount = amount;
		this.paymentDate = paymentDate;
	}

	@Override
	public String toString() {
		return "Payment [payment_Id=" + payment_Id + ", amount=" + amount + ", paymentDate=" + paymentDate + "]";
	}

	

	
}

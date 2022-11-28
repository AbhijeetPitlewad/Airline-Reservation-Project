package com.lti.AirlineBackend.dao;

import org.springframework.stereotype.Repository;

import com.lti.AirlineBackend.entity.Payment;


public interface PaymentDao {

	Payment findPaymentByPaymentId(int paymentId);

	Payment createPayment(Payment payment);

}

package com.lti.AirlineBackend.service;

import org.springframework.stereotype.Service;

import com.lti.AirlineBackend.entity.Payment;


public interface PaymentService {

	Payment findPaymentByPaymentId(int paymentId);

	Payment createPayment(Payment payment);

}

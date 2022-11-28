package com.lti.AirlineBackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.AirlineBackend.entity.Payment;
import com.lti.AirlineBackend.service.PaymentService;

@CrossOrigin("*")
@RestController      //Controller class
@RequestMapping(value = "/payment")
public class PaymentController {

	@Autowired
	PaymentService paymentService;
	
	
	//http://localhost:8282/payment
	
	@PostMapping("/")
	public Payment createPayment(@RequestBody Payment payment )
	{
		Payment payment1 = paymentService.createPayment(payment);
		return payment;
	}
	
	@GetMapping("/{paymentId}")
	public Payment findPaymentByPaymentId(@PathVariable("paymentId") int paymentId )
	{
		Payment payment = paymentService.findPaymentByPaymentId(paymentId) ;
		return payment;
	}
	
	
}
















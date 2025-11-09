package com.CodingShuttel.youtube.InternelWorkingOfSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InternelWorkingOfSpringBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(InternelWorkingOfSpringBootApplication.class, args);
	}

//@Autowired
    private final PaymentService PaymentService;

    public InternelWorkingOfSpringBootApplication(PaymentService paymentService) {
        PaymentService = paymentService;
    }

    @Override
    public void run(String... args) throws Exception {
String Payment  = PaymentService.Pay();
        System.out.println("Payment done : "+Payment);
    }
}

package com.CodingShuttel.youtube.InternelWorkingOfSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Component
/*@Service                     This all Are Ano use to make beans
@Repository
@RestController*/
//@Controller

@ConditionalOnProperty(name = "payment.provider",havingValue = "Stripe")

public class StripePaymentService implements PaymentService{
    @Override
    public String Pay() {
            String Payment= "Stripe Payment ";
            System.out.println("Payment From "+Payment);
            return Payment;

    }
}

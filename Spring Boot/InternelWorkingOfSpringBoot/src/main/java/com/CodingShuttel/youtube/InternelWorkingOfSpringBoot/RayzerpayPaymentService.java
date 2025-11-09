package com.CodingShuttel.youtube.InternelWorkingOfSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "payment.provider",havingValue = "Razzerpay")
public class RayzerpayPaymentService implements PaymentService {

    public String Pay(){
        String Payment= "Rayzorpay Payment ";
        System.out.println("Payment From "+Payment);
                return Payment;
    }

}

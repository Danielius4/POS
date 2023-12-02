package com.psp.possystem.payment.dto;

import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
public class PaymentResponse {
    public int ID = 0;
    public int paymentMethodId = 132165;
    public String giftCardId = null;
    public double tipAmount = 15.58;
    public double loaltyDiscount = 341.5;
    public double finalPrice = 5555.6;
    public double loaltyPointsGained = 2;

    public Date paymentDate = new Date();

}

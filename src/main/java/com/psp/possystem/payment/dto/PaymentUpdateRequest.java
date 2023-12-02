package com.psp.possystem.payment.dto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PaymentUpdateRequest {
    private String paymentType;
    private double paymentAmount;
    public String giftCardId;
    public double tipAmount;
    public double loyaltyDiscount;
    public double finalPrice;
    public double loyaltyPointsGained;

}

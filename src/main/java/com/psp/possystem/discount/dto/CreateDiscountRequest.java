package com.psp.possystem.discount.dto;

import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
public class CreateDiscountRequest {
    public int itemId = 1;
    public double discountPercentage = 10.5;
    public Date validFrom = new Date();
    public Date validTo = new Date(22);
    public boolean isLoyalty = false;
}

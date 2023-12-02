package com.psp.possystem.discount.dto;

import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
public class DiscountQueryRequest {
    public Date startDate;
    public Date endDate;
    public boolean isLoyalty;
    public int discountPercentageFrom;
    public int discountPercentageTo;
}

package com.psp.possystem.payment;


import com.psp.possystem.payment.dto.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.HttpRetryException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
@RestController
@RequestMapping("api/payments")
@Tag(name = "payment controller")
public class PaymentController {

    @GetMapping("/query")
    public List<PaymentResponse> findByQuery(
            @RequestParam double startfinalPrice,
            @RequestParam double endfinalPrice,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime startDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime endDate,
            @RequestParam int paymentMethodId
    ) {
        List<PaymentResponse> payments = new ArrayList<>();
        payments.add(new PaymentResponse());

        return payments;
    }

    @PutMapping("/{paymentId}/tip")
    @Operation(summary = "Update tip information for a payment", description = "Updates tip information for a specific payment.")
    public ResponseEntity<String> updateTipForPayment(@PathVariable Long paymentId, @RequestBody TipUpdateRequest tipUpdateRequest) {
        if (tipUpdateRequest != null) {
            return ResponseEntity.ok("Tip information updated successfully.");
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @PutMapping("/{paymentId}/loyalty")
    @Operation(summary = "Update loyalty information for a payment", description = "Updates loyalty information for a specific payment.")
    public ResponseEntity<String> updateLoyaltyForPayment(@PathVariable Long paymentId, @RequestBody LoyaltyUpdateRequest loyaltyUpdateRequest) {

        if (loyaltyUpdateRequest != null) {
            return ResponseEntity.ok("Loyalty information updated successfully.");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{paymentId}/pay")
    @Operation(summary = "Update payment information for a payment", description = "Updates payment information, including payment type and amount, for a specific payment.")
    public ResponseEntity<String> updatePaymentForPayment(@PathVariable Long paymentId, @RequestBody PaymentUpdateRequest paymentUpdateRequest) {

        if (paymentUpdateRequest != null) {
            return ResponseEntity.ok("Payment information updated successfully.");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{paymentId}/points")
    public PointResponse getPointsForPayment(@PathVariable int paymentId){
        return new PointResponse(new PaymentResponse().loaltyPointsGained, 123.4);
    }

    // WTF?
    @GetMapping("/{paymentId}/discounts")
    @Operation(summary = " ", description = "")
    public void getDiscountsForPayment(@PathVariable int paymentId){
        return ;
    }

    @GetMapping("/{paymentId}/taxes")
    @Operation(summary = "Get tax information for a payment", description = "Returns information about taxes for a specific payment.")
    public TaxesResponse getTaxesForPayment(@PathVariable int paymentId) {
        PaymentResponse res = new PaymentResponse();
        return new TaxesResponse(res.finalPrice * 0.1, res.finalPrice * 0.2);
    }

    @GetMapping("/{paymentId}/price")
    @Operation(summary = "Get final price for a payment", description = "Returns the final price, including all additional charges and taxes, for a specific payment.")
    public ResponseEntity<Double> getFinalPriceForPayment(@PathVariable int paymentId) {
        Double finalPrice = new PaymentResponse().finalPrice;
        return ResponseEntity.ok(finalPrice);
    }
}

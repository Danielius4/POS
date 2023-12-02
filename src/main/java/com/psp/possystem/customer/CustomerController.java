package com.psp.possystem.customer;

import com.psp.possystem.customer.dto.CustomerAddLoyaltyPointsRequest;
import com.psp.possystem.customer.dto.CustomerLoyaltyPointsResponse;
import com.psp.possystem.customer.dto.CustomerRequest;
import com.psp.possystem.customer.dto.CustomerResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
@Tag(name = "customer controller")
public class CustomerController {
    @GetMapping("/{id}")
    @Operation(summary = "Get customer", description = "Get customer by ID")
    public CustomerResponse findById(@PathVariable String id) {
        return new CustomerResponse();
    }
    @PostMapping("/")
    @Operation(summary = "Crate new customer")
    public CustomerResponse create(@RequestBody CustomerRequest request) {
        return new CustomerResponse();
    }
    @PatchMapping("/{id}/add_points")
    @Operation(summary = "Add loyalty points")
    public CustomerLoyaltyPointsResponse addLoyaltyPoints(@RequestBody CustomerAddLoyaltyPointsRequest request, @PathVariable String id) {
        return new CustomerLoyaltyPointsResponse();
    }

    @GetMapping("/{id}/loyalty_points")
    @Operation(summary = "get loyalty points")
    public CustomerLoyaltyPointsResponse getLoyaltyPoints(@PathVariable String id) {
        return new CustomerLoyaltyPointsResponse();
    }
}

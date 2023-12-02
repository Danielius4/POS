package com.psp.possystem.discount;

import com.psp.possystem.discount.dto.CreateDiscountRequest;
import com.psp.possystem.discount.dto.DiscountQueryRequest;
import com.psp.possystem.discount.dto.DiscountResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/discounts")
@Tag(name = "Discounts")
public class DiscountController {
    @PostMapping("/")
    @Operation(summary = "Create discount", description = "Create new discount")
    public DiscountResponse create(@RequestBody CreateDiscountRequest request) {
        return new DiscountResponse();
    }

    @PostMapping("/query")
    @Operation(summary = "Get discount by query object")
    public List<DiscountResponse> findByItemId(@RequestBody DiscountQueryRequest request) {
        List<DiscountResponse> rez = new ArrayList<>();
        rez.add(new DiscountResponse());
        return rez;
    }

    @GetMapping("/validate/{discountId}")
    @Operation(summary = "Validate discount by discount id")
    public DiscountResponse validateDiscount(@PathVariable int discountId) {
        return new DiscountResponse();
    }

    @DeleteMapping("/{discountId}")
    @Operation(summary = "Delete discount")
    public void delete(@PathVariable int discountId) {
    }

    @PatchMapping("/{discountId}")
    @Operation(summary = "Update discount")
    public DiscountResponse update(@PathVariable int discountId, @RequestBody DiscountResponse request) {
        return new DiscountResponse();
    }
}

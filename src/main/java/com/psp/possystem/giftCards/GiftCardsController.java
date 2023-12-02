package com.psp.possystem.controller;

import com.psp.possystem.dto.GiftCardCreateRequest;
import com.psp.possystem.dto.GiftCardResponse;
import com.psp.possystem.exceptions.NotImplementedException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/gifts")
public class GiftCardController {

    @PostMapping("/")
    @ResponseBody
    public GiftCardResponse create(@RequestBody GiftCardCreateRequest request) {
        throw new NotImplementedException();
    }

    @GetMapping("/validate")
    @ResponseBody
    public GiftCardResponse validate(@RequestParam Long giftCardId) {
        throw new NotImplementedException();
    }
}

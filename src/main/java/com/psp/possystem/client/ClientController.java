package com.psp.possystem.client;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clients")
@Tag(name = "Clients")
public class ClientController {
    @GetMapping("/authenticate")
    @Operation(summary = "Get auth client token")
    public String authenticateClient() {

        return generateAuthToken();
    }
    private String generateAuthToken() {
        return "exampleAuthToken";
    }
}

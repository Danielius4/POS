package com.psp.possystem;

import com.psp.possystem.dto.AppointmentRequest;
import com.psp.possystem.dto.AppointmentResponse;
import com.psp.possystem.exceptions.NotImplementedException;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/appointments")
@Tag(name = "Appointments", description = "Endpoints for managing appointments")
public class AppointmentController {

    @PostMapping("/")
    @ResponseBody
    public AppointmentResponse create(@RequestBody AppointmentRequest appointmentRequest) {
        throw new NotImplementedException();
    }

    @PutMapping("/{appointmentId}/book")
    @ResponseBody
    public AppointmentResponse book(@PathVariable Long appointmentId, @RequestBody AppointmentRequest appointmentRequest) {
        throw new NotImplementedException();
    }

    @GetMapping("/{appointmentId}")
    @ResponseBody
    public AppointmentResponse get(@PathVariable Long appointmentId) {
        throw new NotImplementedException();
    }

    public QueryResponse<AppointmentResponse> query(
        @RequestParam Optional<ZonedDateTime> fromDateTime,
        @RequestParam Optional<ZonedDateTime> tillDateTime,
        @RequestParam Optional<List<Long>> ofCustomers,
        @RequestParam Optional<List<Long>> ofServices,
        @RequestParam Optional<String> sortBy,
        @RequestParam Optional<QuerySorting.SortingOrder> sortOrder
    ) {
        throw new NotImplementedException();
    }

    @DeleteMapping("/{appointmentId}")
    @ResponseBody
    public void cancel(@PathVariable Long appointmentId) {
        throw new NotImplementedException();
    }
}

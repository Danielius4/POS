package com.psp.possystem.dto;

import java.time.ZonedDateTime;

public class AppointmentResponse {
    Long appointmentId;
    Long customerId;
    Long serviceId;
    ZonedDateTime reservationTime;
    Long locationId;
    String status; // e.g., "confirmed", "cancelled"

}

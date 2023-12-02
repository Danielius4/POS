package com.psp.possystem.appointment.dto;

import java.time.ZonedDateTime;

public class AppointmentRequest {

    Long customerId;
    Long serviceId;
    ZonedDateTime reservationTime;
    Long locationId;

}

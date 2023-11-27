package com.psp.possystem.dto;

import java.time.ZonedDateTime;

public class AppointmentRequest {

    Long customerId;
    Long serviceId;
    ZonedDateTime reservationTime;
    Long locationId;

}

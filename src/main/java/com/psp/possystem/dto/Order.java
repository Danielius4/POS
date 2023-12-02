package com.psp.possystem.dto;

import java.time.OffsetDateTime;
import nonapi.io.github.classgraph.json.Id;

public record Order(
    @Id int Id,
    int CustomerId,
    int EmployeeId,
    int PaymentId,
    OffsetDateTime OrderDate
    ) {}

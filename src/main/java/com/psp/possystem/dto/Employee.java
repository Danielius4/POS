package com.psp.possystem.dto;

import nonapi.io.github.classgraph.json.Id;

public record Employee(
    @Id int id,
    String firstName,
    String lastName,
    String phoneNumber,
    String email,
    int customerId
) {
}

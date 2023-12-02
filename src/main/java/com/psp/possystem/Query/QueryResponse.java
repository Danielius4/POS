package com.psp.possystem.query;

import java.util.List;

public record QueryResponse<T>(
    int count,
    List<T> items
) {} 

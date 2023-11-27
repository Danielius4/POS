package com.psp.possystem.Query;

import java.util.List;

public record QueryResponse<T>(
    int limit,
    int count,
    List<T> items
) {} 

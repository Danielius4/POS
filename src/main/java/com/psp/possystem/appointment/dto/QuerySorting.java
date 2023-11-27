package com.psp.possystem.dto;

public class QuerySorting {
    public enum SortingOrder {
        ASCENDING, DESCENDING
    }

    String sortBy;
    SortingOrder order;
}

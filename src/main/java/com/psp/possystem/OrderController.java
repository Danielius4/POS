package com.psp.possystem;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.psp.possystem.common.Exceptions;
import com.psp.possystem.dto.Order;
import com.psp.possystem.query.QueryResponse;
import com.psp.possystem.query.QuerySorting;

@RestController
@RequestMapping("/api/orders")
@Tag(name = "Orders")
public class OrderController {

    // 0. GET /orders/{order_id}
    @RequestMapping(value = "/{orderId}", method = RequestMethod.GET)
    @ResponseBody
    public Order get(@PathVariable int orderId) {
        throw Exceptions.NotImplementedException;
    }

    // 1. POST /orders/
    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    public Order create(@RequestBody Order order) {
        throw Exceptions.NotImplementedException;
    }

    // 2. GET /orders/query
    /**
     * @param sorting      - unordered by default
     * @param limit        - maximum number of entities to return
     * @param offset       - starting point of the result set
     * @param fromDateTime - date and time from which to search
     * @param tillDateTime - date and time till which to search
     * @param ofCustomers  - if not specified all orders with specified
     *                     customerIds are queried, if specified but empty - none.
     * @param ofEmployees  - if not specified all orders with specified
     *                     employeeIds are queried, if specified but empty - none.
     */
    @RequestMapping(value = "/query", method = RequestMethod.GET)
    @ResponseBody
    public QueryResponse<Order> query(
            QuerySorting sorting,
            @RequestParam(defaultValue = "100") int limit,
            @RequestParam(defaultValue = "0") int offset,
            @RequestParam Optional<ZonedDateTime> fromDateTime,
            @RequestParam Optional<ZonedDateTime> tillDateTime,
            @RequestParam Optional<List<Integer>> ofCustomers,
            @RequestParam Optional<List<Integer>> ofEmployees) {
        throw Exceptions.NotImplementedException;
    }

    // 4. PUT /orders/{order id}/ - replace existing order
    @RequestMapping(value = "/{orderId}/", method = RequestMethod.PUT)
    @ResponseBody
    public Order reorder(@PathVariable int orderId, @RequestBody Order order) {
        throw Exceptions.NotImplementedException;
    }

    // 5. PATCH /orders/{order id}/complete - mark order as complete
    @RequestMapping(value = "/{orderId}/complete", method = RequestMethod.PATCH)
    @ResponseBody
    public Order reorder(@PathVariable int orderId) {
        throw Exceptions.NotImplementedException;
    }

    // 6. PATCH /orders/{order id}/cancel - mark order as canceled
    @RequestMapping(value = "/{orderId}/cancel", method = RequestMethod.PATCH)
    @ResponseBody
    public void cancel(@PathVariable int orderId) {
        throw Exceptions.NotImplementedException;
    }
}

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

import com.psp.possystem.Common.Exceptions;
import com.psp.possystem.DTOs.Order;
import com.psp.possystem.Query.QueryResponse;
import com.psp.possystem.Query.QuerySorting;

@RestController
@RequestMapping("/api")
@Tag(name = "Order", description = "Order endpoints")
public class OrderController {

    // 0. GET /orders/{order_id}
    @RequestMapping(value = "/orders/{orderId}", method = RequestMethod.GET)
    @ResponseBody
    public Order get(@PathVariable int orderId) {
        throw Exceptions.NotImplementedException;
    }

    // 1. POST /orders/
    @RequestMapping(value = "/orders/", method = RequestMethod.POST)
    @ResponseBody
    public Order create(@RequestBody Order order) {
        throw Exceptions.NotImplementedException;
    }

    // 2. GET /orders/query
    /**
     * @param sorting - unordered by default
     * @param fromDateTime - date and time from which to search
     * @param tillDateTime - date and time till which to search
     * @param ofCustomers - if not specified all customers, if specified but empty then none of the customers are queried.
     * @param ofEmployees - if not specified all employees, if specified but empty then none of the employees are queried.
     * @return
     */
    @RequestMapping(value = "/orders/query", method = RequestMethod.GET)
    @ResponseBody
    public QueryResponse<Order> query(
        @RequestParam(defaultValue = "UNORDERED") QuerySorting.Sorting sorting,
        @RequestParam Optional<ZonedDateTime> fromDateTime,
        @RequestParam Optional<ZonedDateTime> tillDateTime,
        @RequestParam Optional<List<Integer>> ofCustomers,
        @RequestParam Optional<List<Integer>> ofEmployees
    ) {
        throw Exceptions.NotImplementedException;
    }

    // 3. GET /orders/kitchen - order details for kitchen
    // TODO: išsiaiškint kas čia per endpointas vapšie, man visiškai neaišku nei kaip request'as turėtų atordoyt, nei response'as.
    @RequestMapping(value = "/orders/kitchen", method = RequestMethod.GET)
    @ResponseBody
    public void kitchen(@PathVariable int orderId) {
        throw Exceptions.NotImplementedException;
    }

    // 4. PUT /orders/{order id}/ - replace existing order
    @RequestMapping(value = "/orders/{orderId}/", method = RequestMethod.PUT)
    @ResponseBody
    public Order reorder(@PathVariable int orderId, @RequestBody Order order) {
        throw Exceptions.NotImplementedException;
    }

    // 5. PATCH /orders/{order id}/complete - mark order as complete
    @RequestMapping(value = "/orders/{orderId}/complete", method = RequestMethod.PATCH)
    @ResponseBody
    public Order reorder(@PathVariable int orderId) {
        throw Exceptions.NotImplementedException;
    }

    // 6. PATCH /orders/{order id}/cancel - mark order as canceled
    @RequestMapping(value = "/orders/{orderId}/cancel", method = RequestMethod.PATCH)
    @ResponseBody
    public void cancel(@PathVariable int orderId) {
        throw Exceptions.NotImplementedException;
    }
}


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
@RequestMapping("/api")
@Tag(name = "Order", description = "Order endpoints")
public class OrderController {

    // 0. GET /orders/{order_id}
    @RequestMapping(value = "/orders/{order_id}", method = RequestMethod.GET)
    @ResponseBody
    public Order get(@PathVariable int order_id) {
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
    @RequestMapping(value = "/orders/query", method = RequestMethod.GET)
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

    // 3. GET /orders/kitchen - order details for kitchen
    // TODO: išsiaiškint kas čia per endpointas vapšie, man visiškai neaišku nei
    // kaip request'as turėtų atordoyt, nei response'as.
    @RequestMapping(value = "/orders/{order_id}/kitchen", method = RequestMethod.GET)
    @ResponseBody
    public void kitchen(@PathVariable int order_id) {
        throw Exceptions.NotImplementedException;
    }

    // 4. PUT /orders/{order id}/ - replace existing order
    @RequestMapping(value = "/orders/{order_id}/", method = RequestMethod.PUT)
    @ResponseBody
    public Order reorder(@PathVariable int order_id, @RequestBody Order order) {
        throw Exceptions.NotImplementedException;
    }

    // 5. PATCH /orders/{order id}/complete - mark order as complete
    @RequestMapping(value = "/orders/{order_id}/complete", method = RequestMethod.PATCH)
    @ResponseBody
    public Order reorder(@PathVariable int order_id) {
        throw Exceptions.NotImplementedException;
    }

    // 6. PATCH /orders/{order id}/cancel - mark order as canceled
    @RequestMapping(value = "/orders/{order_id}/cancel", method = RequestMethod.PATCH)
    @ResponseBody
    public void cancel(@PathVariable int order_id) {
        throw Exceptions.NotImplementedException;
    }
}

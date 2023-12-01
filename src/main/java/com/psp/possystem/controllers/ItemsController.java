package com.psp.possystem.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@RequestMapping("/items")
@RestController
public class ItemsController {
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/")
	public ExistingItem create(@RequestBody @Valid Item item) {
		return new ExistingItem();
	}
	@GetMapping("/query")
	@Operation(summary = "Get items based on category, type, price range, order, discount, tax that is applied.")
	public List<ExistingItem> query(
			@RequestParam(defaultValue="UNORDERED") QuerySorting.Sorting sorting,
			@RequestParam Integer limit,
			@RequestParam(required=false, defaultValue="0") Integer offset,
			@RequestParam(required=false) String category,
			@RequestParam(required=false) String type,
			@RequestParam(required=false) double priceFrom,
			@RequestParam(required=false) double priceTo,
			@RequestParam(required=false) String orderId,
			@RequestParam(required=false) String discountId,
			@RequestParam(required=false) String taxId
			) {
		return new ArrayList<>();
	}
	@GetMapping("/{itemId}")
	@Operation(summary = "Show what tax, discount, order ids are associated with the item.")
	public ItemGetResponse get(
			@PathVariable String itemId,
			@RequestParam(defaultValue="UNORDERED") QuerySorting.Sorting sorting,
			@RequestParam Integer limit,
			@RequestParam(required=false, defaultValue="0") Integer offset
			) {
		return new ItemGetResponse();
	}
	@PatchMapping("/{itemId}/categorize")
	@Operation(summary = "Assigns item to a category of items")
	public void categorize(@PathVariable String itemId, @RequestParam String category) {
		return;
	}
	@PatchMapping("/{itemId}/reprice")
	@Operation(summary = "Sets new price to the item")
	public void reprice(@PathVariable String itemId, @RequestParam double newPrice) {
		return;
	}
	@PatchMapping("/{itemId}/restock")
	@Operation(summary = "Changes the stock quantity of the item")
	public void restock(@PathVariable String itemId, @RequestParam int newStockQuantity) {
		return;
	}
	@PutMapping("/{itemId}/discount")
	@Operation(summary = "Applies already created discount to the item")
	public void discount(@PathVariable String itemId, @RequestParam String discountId) {
		return;
	}
	@DeleteMapping("/{itemId}")
	public void delete(@PathVariable String itemId) {
		return;
	}
}

@NotNull
class Item {
	public String id;
	public String clientId;
	public String name;
	public double price;
	public String description;
	public String itemType;
	public String itemCategory;
	public int stockQTY;
}

class ExistingItem extends Item {
	public String id;
}

class ItemGetResponse {
	List<String> taxIds;
	List<String> discountIds;
	List<String> orderIds;
}

class QuerySorting {
    public enum Sorting { DESCENDING, ASCENDING, UNORDERED; } 
}

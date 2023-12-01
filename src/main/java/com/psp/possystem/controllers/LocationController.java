package com.psp.possystem.controllers;


import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

@RequestMapping("/locations")
@RestController
public class LocationController {
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/")
	public ExistingLocation createLocation(
			@RequestParam String name,
			@RequestParam String description
			) {
		ExistingLocation location = new ExistingLocation(name, description);
		return location;
	}
	@GetMapping("/{locationId}")
	public ExistingLocation get(@PathVariable String locationId) {
		ExistingLocation dummyLocation = new ExistingLocation("table", "cool table near window");
		dummyLocation.id = locationId;
		return dummyLocation;
	}
	@GetMapping("/query")
	public List<ExistingLocation> query(
			@RequestParam(defaultValue="UNORDERED") QuerySorting.Sorting sorting,
			@RequestParam Integer limit,
			@RequestParam(defaultValue="0") Integer offset
			) {
		return Arrays.asList(new ExistingLocation("table", "bimbim"), new ExistingLocation("table2", "bimbom"));
	}
	@DeleteMapping("/{locationId}")
	public ExistingLocation deleteLocation(@PathVariable String locationId) {
		ExistingLocation location = new ExistingLocation("chair", "bimbim");
		location.id = locationId;
		return location;
	}
}

class Location {
	public String name;
	public String description;
}

class ExistingLocation extends Location {
	public String id;
	
	public ExistingLocation(String name, String description) {
		this.name = name;
		this.description = description;
		this.id = UUID.randomUUID().toString();
	}
}
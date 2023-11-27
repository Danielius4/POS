package com.psp.possystem.controllers;


import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.psp.possystem.exceptions.NotFoundException;

import jakarta.validation.constraints.Positive;

@RequestMapping("/locations")
@RestController
public class LocationController {
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping()
	public ExistingLocation createLocation(
			@RequestParam String name,
			@RequestParam String description
			) {
		ExistingLocation location = new ExistingLocation(name, description);
		return location;
	}
	@GetMapping()
	public ExistingLocation getLocationById(@RequestParam String id) throws NotFoundException {
		if (id.contains("1")) {
			throw new NotFoundException(String.format("Location with id = %s not found", id));
		}
		ExistingLocation dummyLocation = new ExistingLocation("table", "cool table near window");
		dummyLocation.id = id;
		return dummyLocation;
	}
	@GetMapping("/query")
	public List<ExistingLocation> getLocations(
			@RequestParam String name,
			@RequestParam String description,
			@RequestParam(required=false, defaultValue="0") Integer offset,
			@RequestParam(required=false, defaultValue="0") Integer limit,
			@RequestParam(required=false, defaultValue="false") Boolean ascending
			) {
		return Arrays.asList(new ExistingLocation("table", "bimbim"), new ExistingLocation("table2", "bimbom"));
	}
	@DeleteMapping()
	public ExistingLocation deleteLocation(@RequestParam String id) {
		ExistingLocation location = new ExistingLocation("chair", "bimbim");
		location.id = id;
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
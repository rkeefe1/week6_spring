package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// tell spring that we can listen to requests
@RestController
public class ListController {

	private List<String> sandwiches = new ArrayList<String>();
	
	public ListController() {
		sandwiches.add("blta");
		sandwiches.add("italian bmt");
		sandwiches.add("smores");
		sandwiches.add("mcdonalds");
		sandwiches.add("roast beef");
		sandwiches.add("tuna");
		sandwiches.add("muffeleta");
		
	}
	//find an item by its index and update the value at the position
	@PutMapping("/sandwich/{index}")
	public String updateSandwich(@PathVariable int index,@RequestBody String sandwich) {
		return sandwiches.set(index, sandwich);
	}
}

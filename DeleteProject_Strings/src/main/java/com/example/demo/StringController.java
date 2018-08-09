package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// tell spring that we will listen to requests
@RestController
public class StringController {

	private List<String> colors = new ArrayList<String>();
	
	public StringController() {
		colors.add("Blue");
		colors.add("Grue");
		colors.add("Purple");
		colors.add("Gold");
		colors.add("Green");
		colors.add("Silver");
	}
	// remove a color
	@DeleteMapping("/color/{index}")
	public boolean removecolor(@PathVariable int index) {
		try {
			this.colors.remove(index);
			return true;
		} catch (IndexOutOfBoundsException ex) {
			return false;
		}
	}
}

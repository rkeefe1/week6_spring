package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// step 1, tell spring that this will accept requests
@RestController
public class VariableController {

	// private variables
	// String is capitalized because it is a class
	// private means that only the VariableController has access
	private String myName = "Ammon";
	private int myNumber = 52;
	private boolean myBool = true;
	private double myDouble = 5 * 2;
	private float myFloat = 8f;
	// make a boolean following the same process
	// make a double following the same process
	// make a float using the same process

	// listen to an incoming GET request at the specified path
	@GetMapping("/name")
	public String getName() {
		// this. is similar to saying ME
		return this.myName;
	}

	@GetMapping("/number")
	public int getNumber() {
		return this.myNumber;
	}

	@GetMapping("/bool")
	public boolean getBool() {
		return this.myBool;
	}

	@GetMapping("/double")
	public double getDouble() {
		return this.myDouble;

	}

	@GetMapping("/float")

	public float getFloat() {
		return this.myFloat;
	}

}

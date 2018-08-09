package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// tell spring that this will handle requests
@RestController
public class ListController {

	private String[] myArray = {"apple","mine","sloth","pizza","sandwich","pineapple"};
	
	private List<String> myArrayList = new ArrayList<String>();
	
	//no good way to start with arraylist items
	//use a constructor
	public ListController() {
		myArrayList.add("giraffe");
		myArrayList.add("elephant");
		myArrayList.add("dog");
		myArrayList.add("sphinx");
		myArrayList.add("wolf");
		myArrayList.add("cougar");
		
	}
	
	
	//get the whole array
	@GetMapping("/array")
	public String[] getArray() {
		return this.myArray;
	}
	// get an item of array by index
	@GetMapping("/array/{index}")
	public String getArrayItem(@PathVariable int index) {
		return myArray[index];
	}
	//get the whole list
	@GetMapping("/list")
	public List<String> getList() {
		return this.myArrayList;
	}
	//get an item out of the arraylist by its index
	@GetMapping("/list/{index}")
	public String getListItem(@PathVariable int index) {
		return myArrayList.get(index);
	}
}

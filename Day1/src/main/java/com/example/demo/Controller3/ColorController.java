package com.example.demo.Controller3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColorController {
	String myFavColor="Pink";
	@GetMapping("/Color")
	public String getColor() {
		return "My fav color is "+myFavColor;
	}
}

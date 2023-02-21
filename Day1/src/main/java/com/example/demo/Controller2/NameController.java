package com.example.demo.Controller2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
	String name="IamNeo!";
	@GetMapping("/getMsg")
	public String getMsg() {
		return "Welcome "+name;
	}
}

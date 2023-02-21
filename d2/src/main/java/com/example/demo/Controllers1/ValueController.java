package com.example.demo.Controllers1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueController {
	@Value("${greeting.message}")
	private String s;
	@GetMapping("/msg")
	public String getMsg() {
		return s;
	}
}
package com.example.demo.Controller1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {
	@RequestMapping("/Welcome")
	public String Welcome() {
		return "Welcome String Boot!";
	}

}

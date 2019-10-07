package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/home")
	public String home() {
		return "Hello world!!!";
	}
	
	@RequestMapping("/entity")
	public String getEntity(@RequestParam int id) {
		return "Entity id: "+id;
	}
	
	@RequestMapping("/entityextended")
	public String getEntityExtended(@RequestParam int id) {
		return "Extended entity id: "+id;
	}
}

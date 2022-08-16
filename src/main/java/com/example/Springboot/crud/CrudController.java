package com.example.Springboot.crud;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class CrudController {
	@GetMapping
	public String getHello() {
		return "get mpping got called";
	}
	
	
	@PostMapping
	public String postHello() {
		return "post mapping got called";
	}
	
	@PutMapping
	public String putHello() {
		return "put mapping got called";
	}
	
	
	@DeleteMapping
	public String deleteHello() {
		return "delete Mapping got called";
	}



}

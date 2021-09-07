package com.revature.training.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.training.pms.model.Product;

@RestController
@RequestMapping("employees")
public class AhmedController {

	
	@GetMapping
	public void getEmployee() {
		
	}
	@PutMapping
	public void updateEmployees(@RequestBody Product product) {
			//update code
	}
}

//http://localhost:9090/employees	-GET,PUT
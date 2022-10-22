package com.microservice.udemy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.udemy.bean.Limit;
import com.microservice.udemy.bean.LimitPropertyConfigs;

@RestController
public class LimitsController {

	@Autowired
	public LimitPropertyConfigs limitPropertyConfigs;
	
	@GetMapping("/limits")
	public Limit getlimit() {
		return new Limit(limitPropertyConfigs.getMin(), limitPropertyConfigs.getMax());
	}
}

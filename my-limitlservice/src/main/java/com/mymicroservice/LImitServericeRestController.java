package com.mymicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LImitServericeRestController {

	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limitconfig")
	public LimitServericeConfigurtaion getLimitServericeConfigurtaion() {
		
		return new LimitServericeConfigurtaion(configuration.getMax(), configuration.getMin());
	}
}

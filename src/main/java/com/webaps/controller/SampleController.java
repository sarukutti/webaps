package com.webaps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SampleController {
	@GetMapping("/getvalue")
	public String getValue() {
		return "The endpoint call you invoked reached Sastha Roopan's Application...";
	}

}

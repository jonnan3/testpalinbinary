package com.example.project.binaryconversion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.binaryconversion.service.BinaryService;

@RestController
@RequestMapping("/binary")
public class BinaryController {
	
	@Autowired
	private BinaryService binaryService;
	
	@GetMapping(value = "/{decimalNumber}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String reverseBinaryNumber(@PathVariable("decimalNumber") String decimalNumber) {
		
		return binaryService.binaryConversion(decimalNumber);
		
	}
	

}

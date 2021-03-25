package com.example.project.binaryconversion.service;

import org.springframework.stereotype.Service;
@Service
public class BinaryServiceImpl implements BinaryService {
	
	
	public String binaryConversion(String inputStr) {
		return  Integer.toBinaryString(Integer.parseInt(inputStr));
	}

}

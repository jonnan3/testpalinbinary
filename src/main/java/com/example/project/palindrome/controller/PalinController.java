package com.example.project.palindrome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.palindrome.service.PalinServiceImpl;

@RestController
@RequestMapping("/palindrome")
public class PalinController {
	@Autowired
	private PalinServiceImpl palindromeService;

	@GetMapping(value = "/{inpuStraing}")
	public String checkAndInsertPalindrome(@PathVariable("inpuStraing") String stringVariable) {
		return palindromeService.checkAndInsertPalindrome(stringVariable);
	}
}

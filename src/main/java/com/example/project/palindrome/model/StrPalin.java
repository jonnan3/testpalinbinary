package com.example.project.palindrome.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StrPalin {
	@Id
	String palindromeString;

	public String getPalindromeString() {
		return palindromeString;
	}

	public void setPalindromeString(String palindromeString) {
		this.palindromeString = palindromeString;
	}
}

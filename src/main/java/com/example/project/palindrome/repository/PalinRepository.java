package com.example.project.palindrome.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.palindrome.model.StrPalin;

@Repository
public interface PalinRepository extends JpaRepository<StrPalin, String>{

}

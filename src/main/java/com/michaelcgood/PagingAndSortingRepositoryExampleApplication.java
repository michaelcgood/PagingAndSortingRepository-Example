package com.michaelcgood;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.michaelcgood.dao.ClientRepository;

@SpringBootApplication
public class PagingAndSortingRepositoryExampleApplication {
	
	@Autowired
	ClientRepository clientrepository;

	public static void main(String[] args) {
		SpringApplication.run(PagingAndSortingRepositoryExampleApplication.class, args);
	}
	
	
	
	
}

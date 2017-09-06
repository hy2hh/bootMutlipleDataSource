package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.service.TestDao;

@SpringBootApplication
public class MultidbApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MultidbApplication.class, args);
		
		
	}
}

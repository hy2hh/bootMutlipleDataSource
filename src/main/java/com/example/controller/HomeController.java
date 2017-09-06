package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapper.TestMapper;
import com.example.service.TestDao;

@RestController
public class HomeController {
	
	@Autowired
	private TestDao td;
	
	@RequestMapping("/")
	public String test() {
		td.test();
		return "test";
	}
	
	@RequestMapping("/1")
	public String test2() {
		td.test2();
		return "test";
	}
	
}

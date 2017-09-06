package com.example.service;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.mapper.TestMapper;

@Service
@Component
public class TestDao {
	
	@Autowired
	private TestMapper test;
	
	@Transactional(readOnly=true)
	public void test(){
		System.out.println(test.test2());
	}
	
	public void test2(){
		System.out.println(test.test2());
	}
	
}

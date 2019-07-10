package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.UserMapper;

@RestController
public class HelloController {
	
	/*
	 * @Autowired private JdbcTemplate jdbcTemplate;
	 */

//	@Autowired
//	private Person person;
	
	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("sayHello")
	public String hello() {
//		System.out.println("jdbcTemplate: "+jdbcTemplate);
//		return "Hello "+person.getName()+"!";
		return "Hello "+userMapper.getList().get(0).getUserName()+"!";	
	}
}

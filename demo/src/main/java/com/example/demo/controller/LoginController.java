package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	  private Logger logger = LoggerFactory.getLogger(this.getClass());
	  
	  @RequestMapping("/login") 
	  public String login() {
		  System.out.println("/login登录页面...");
		  logger.info("/login登录页面...");
		  return "/login"; 
	  }
	  
	  @RequestMapping("/user/login") 
	  public String userLogin() {
		  System.out.println("/user/login登录页面...");
		  logger.info("/user/login登录页面...");
		  return "/userLogin"; 
	  }
	  
	  @RequestMapping("/index") 
	  public String index() {
		  System.out.println("登录成功...");
		  logger.info("登录成功...");
		  return "/index";
	  }
	  

	  @RequestMapping("/home") 
	  public String home() {
		  System.out.println("/home登录成功...");
		  logger.info("/home登录成功...");
		  return "/home"; 
	  }
	  
	  @RequestMapping("/") 
	  public String root() {
		  System.out.println("/登录成功...");
		  logger.info("/登录成功...");
		  return "/home"; 
	  }
	 
}
